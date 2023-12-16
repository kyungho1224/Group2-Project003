package com.fastcampus.be7.group2.model;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-16(016)
 */
public class Locale {

    private String name;

    private List<LocalName> localNamesList;

    private Double lat;

    private Double lon;

    private String country;

    public Locale() {
    }

    public Locale(String name, List<LocalName> localNamesList, Double lat, Double lon, String country) {
        this.name = name;
        this.localNamesList = localNamesList;
        this.lat = lat;
        this.lon = lon;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LocalName> getLocalNamesList() {
        return localNamesList;
    }

    public void setLocalNamesList(List<LocalName> localNamesList) {
        this.localNamesList = localNamesList;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Locale{" +
                "name='" + name + '\'' +
                ", localNamesList=" + localNamesList +
                ", lat=" + lat +
                ", lon=" + lon +
                ", country='" + country + '\'' +
                '}';
    }
}
