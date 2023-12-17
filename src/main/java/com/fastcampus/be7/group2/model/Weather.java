package com.fastcampus.be7.group2.model;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */
public class Weather {

    private int resultCode;

    private String description;

    private Double temp;

    private Double tempMin;

    private Double tempMax;

    private Integer humidity;

    private String sunrise;

    private String sunset;

    public Weather() {
    }

    public Weather(int resultCode, String description, Double temp, Double tempMin, Double tempMax, Integer humidity, String sunrise, String sunset) {
        this.resultCode = resultCode;
        this.description = description;
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.humidity = humidity;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "resultCode=" + resultCode +
                ", description='" + description + '\'' +
                ", temp=" + temp +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", humidity=" + humidity +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                '}';
    }
}
