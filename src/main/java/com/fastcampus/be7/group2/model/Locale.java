package com.fastcampus.be7.group2.model;

/**
 * Created by KimKyungHo on 2023-12-16(016)
 */
public class Locale {

    private boolean isSucceed = false;

    private String name;

    private Double lat;

    private Double lon;

    public Locale() {
    }

    public Locale(boolean isSucceed, String name, Double lat, Double lon) {
        this.isSucceed = isSucceed;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    public boolean isSucceed() {
        return isSucceed;
    }

    public void setSucceed(boolean succeed) {
        isSucceed = succeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Locale{" +
                "isSucceed=" + isSucceed +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
