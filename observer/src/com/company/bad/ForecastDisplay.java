package com.company.bad;

public class ForecastDisplay {
    public void update(int temp, int humidity, int pressure) {
        String massage = "";
        System.out.println("Forecast");
        if (humidity >= 70) {
            if (temp <= 0) {
                massage = "Snow";
            } else {
                massage= "Rain";
            }
        } else if (humidity >= 50) {
            massage = "Clouds";
        } else {
            massage = "Clear";
        }
        System.out.println(massage + '\n');
    }
}
