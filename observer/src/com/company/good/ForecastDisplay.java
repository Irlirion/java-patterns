package com.company.good;

public class ForecastDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private int humidity;
    private int temp;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        String massage = "";
        System.out.print("Forecast: ");
        if (humidity >= 70) {
            if (temp <= 0) {
                massage = "Snow";
            } else {
                massage = "Rain";
            }
        } else if (humidity >= 50) {
            massage = "Clouds";
        } else {
            massage = "Clear";
        }
        System.out.println(massage);
    }
}
