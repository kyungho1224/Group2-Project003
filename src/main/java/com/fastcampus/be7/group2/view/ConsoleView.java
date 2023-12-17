package com.fastcampus.be7.group2.view;

import com.fastcampus.be7.group2.model.Weather;

import java.util.Scanner;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */
public class ConsoleView {

    Scanner scanner = new Scanner(System.in);

    public String getCountry() {
        System.out.print("지역을 입력해주세요(시 또는 구 또는 동) : ");
        return scanner.nextLine();
    }

    public void printWeather(Weather weather) {
        System.out.println("==============================");
        System.out.println("날씨 : " + weather.getDescription());
        System.out.println("평균기온 : " + Math.round(weather.getTemp()));
        System.out.println("최저기온 : " + Math.round(weather.getTempMin()));
        System.out.println("최고기온 : " + Math.round(weather.getTempMax()));
        System.out.println("습도 : " + weather.getHumidity());
        System.out.println("일출시각 : " + weather.getSunrise());
        System.out.println("일몰시각 : " + weather.getSunset());
        System.out.println("==============================");
    }

}
