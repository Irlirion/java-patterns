package com.company.good;

public class StatisticsDisplay implements Observer, DisplayElement{
    private Subject weatherData;
    private int minTemp = 100;
    private int maxTemp = -100;
    private int sumTemp = 0;
    private int countTemp = 0;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(int temp, int humidity, int pressure) {
        sumTemp += temp;
        countTemp++;
        if (temp < minTemp) {
            minTemp = temp;
        }

        if (temp > maxTemp) {
            maxTemp = temp;
        }
        display();
    }

    @Override
    public void display() {
        System.out.print("Avg/Min/Max temperature: ");
        System.out.print(Math.round((float) sumTemp / countTemp) + "/");
        System.out.print(minTemp + "/");
        System.out.println(maxTemp);
    }
}
