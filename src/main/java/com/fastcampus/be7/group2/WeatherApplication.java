package com.fastcampus.be7.group2;

import com.fastcampus.be7.group2.controller.LocaleController;
import com.fastcampus.be7.group2.model.Locale;

/**
 * Created by KimKyungHo on 2023-12-17(017)
 */
public class WeatherApplication {
    public static void main(String[] args) {
        Locale locale = new LocaleController().getLocale("인천시남동구만수동");
        System.out.println(locale.isSucceed());
    }
}
