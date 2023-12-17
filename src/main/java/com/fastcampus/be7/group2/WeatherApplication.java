package com.fastcampus.be7.group2;

import com.fastcampus.be7.group2.controller.WeatherController;

/**
 * Created by KimKyungHo on 2023-12-17(017)
 */
public class WeatherApplication {
    public static void main(String[] args) {

        WeatherController weatherController = new WeatherController();

        weatherController.applicationStart();

    }
}
