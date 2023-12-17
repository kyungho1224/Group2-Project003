package com.fastcampus.be7.group2.controller;

import com.fastcampus.be7.group2.model.Locale;
import com.fastcampus.be7.group2.service.LocaleService;

/**
 * Created by KimKyungHo on 2023-12-17(017)
 */
public class LocaleController {

    private final LocaleService localeService;

    public LocaleController() {
        localeService = new LocaleService();
    }

    public Locale getLocale(String country) {
        return localeService.locale(country);
    }
}
