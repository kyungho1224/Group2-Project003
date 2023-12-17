package com.fastcampus.be7.group2.controller;

import com.fastcampus.be7.group2.model.Locale;
import com.fastcampus.be7.group2.model.Weather;
import com.fastcampus.be7.group2.service.LocaleService;
import com.fastcampus.be7.group2.service.WeatherService;
import com.fastcampus.be7.group2.view.ConsoleView;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */
public class WeatherController {

    private final ConsoleView consoleView;
    private final LocaleService localeService;
    private final WeatherService weatherService;

    public WeatherController() {
        consoleView = new ConsoleView();
        localeService = new LocaleService();
        weatherService = new WeatherService();
    }

    public void applicationStart() {
        while (true) {
            String country = consoleView.getCountry();
            if (country.equalsIgnoreCase("q")) {
                break;
            } else {
                Locale locale = localeService.locale(country);
                Weather weather = weatherService.weather(locale);
                consoleView.printWeather(weather);
            }
        }
    }
}
