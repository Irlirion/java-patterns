package com.company.bad;

public class BadWeatherStation {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        data.measurementsChanged();
        data.measurementsChanged();
    }
}
