package com.company.good;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private int temp;
    private int humidity;
    private int pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Current Condition: ");
        System.out.print(temp + "C degrees, ");
        System.out.print(humidity + "%, ");
        System.out.println(pressure + " millimeters of mercury");
    }
}
