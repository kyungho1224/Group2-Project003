package com.fastcampus.be7.group2.model;

/**
 * Created by KimKyungHo on 2023-12-16(016)
 */
public class LocalName {
    private String en;
    private String ko;

    public LocalName() {
    }

    public LocalName(String en, String ko) {
        this.en = en;
        this.ko = ko;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getKo() {
        return ko;
    }

    public void setKo(String ko) {
        this.ko = ko;
    }

    @Override
    public String toString() {
        return "LocalName{" +
                "en='" + en + '\'' +
                ", ko='" + ko + '\'' +
                '}';
    }
}
