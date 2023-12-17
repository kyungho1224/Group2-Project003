package com.fastcampus.be7.group2.service;

import com.fastcampus.be7.group2.model.Locale;
import com.fastcampus.be7.group2.util.Api;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by KimKyungHo on 2023-12-17(017)
 */
public class LocaleService {

    public Locale locale(String country) {

        String address = "http://api.openweathermap.org/geo/1.0/direct?q=" + country + "&limit=5&appid=" + Api.key();
        Locale locale;
        int responseCode;

        try {
            locale = new Locale();
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
                JsonArray localeArray = JsonParser.parseString(sb.toString()).getAsJsonArray();
                for (JsonElement element : localeArray) {
                    JsonObject object = element.getAsJsonObject();
                    if (object.getAsJsonObject().has("country")) {
                        String ct = object.getAsJsonObject().get("country").getAsString();
                        if (ct.equals("KR")) {
                            locale.setLat(object.getAsJsonObject().get("lat").getAsDouble());
                            locale.setLon(object.getAsJsonObject().get("lon").getAsDouble());
                            locale.setSucceed(true);
                            locale.setName(country);
                            break;
                        }
                    }
                }

            } else {
                throw new RuntimeException("Http Error");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return locale;
    }

}
