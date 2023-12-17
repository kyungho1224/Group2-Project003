package com.fastcampus.be7.group2.service;

import com.fastcampus.be7.group2.model.Locale;
import com.fastcampus.be7.group2.model.Weather;
import com.fastcampus.be7.group2.util.Api;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */
public class WeatherService {
    public Weather weather(Locale locale) {

        String address = "https://api.openweathermap.org/data/2.5/weather?lat="
                + locale.getLat() + "&lon=" + locale.getLon()
                + "&appid=" + Api.key() + "&lang=kr";
        Weather weather;
        int responseCode;

        try {
            weather = new Weather();
            URL url = new URL(address);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuffer sb = new StringBuffer();
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                br.close();

                // json parsing
                JsonObject weatherData = JsonParser.parseString(sb.toString()).getAsJsonObject();
                JsonArray weatherArray = weatherData.getAsJsonArray("weather");

                String description = weatherArray.get(0).getAsJsonObject().get("description").getAsString();
                double temp = convertKelvinToCelsius(weatherData.getAsJsonObject("main").get("temp").getAsDouble());
                double tempMin = convertKelvinToCelsius(weatherData.getAsJsonObject("main").get("temp_min").getAsDouble());
                double tempMax = convertKelvinToCelsius(weatherData.getAsJsonObject("main").get("temp_max").getAsDouble());
                int humidity = weatherData.getAsJsonObject("main").get("humidity").getAsInt();
                String sunrise = convertEpochToTimestamp(weatherData.getAsJsonObject("sys").get("sunrise").getAsLong());
                String sunset = convertEpochToTimestamp(weatherData.getAsJsonObject("sys").get("sunset").getAsLong());

                weather.setDescription(description);
                weather.setTemp(temp);
                weather.setTempMin(tempMin);
                weather.setTempMax(tempMax);
                weather.setHumidity(humidity);
                weather.setSunrise(sunrise);
                weather.setSunset(sunset);

            } else {
                throw new RuntimeException("Http Error");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        weather.setResultCode(responseCode);

        return weather;
    }

    private double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private String convertEpochToTimestamp(long epoch) {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                .format(new Date(epoch * 1000));
    }
}
