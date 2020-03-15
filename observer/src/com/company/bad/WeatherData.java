package com.company.bad;


public class WeatherData {
    private CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
    private StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();

    int getTemperature() {
        return (int) (Math.random() * 100) - 50;
    }

    int getHumidity() {
        return (int) (Math.random() * 100);
    }

    int getPressure() {
        return (int) (Math.random() * 26) + 740;
    }

    void measurementsChanged() {
        int temp = getTemperature();
        int humidity = getHumidity();
        int pressure = getPressure();

        System.out.println("Displays:");
        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
        System.out.println();
    }
}
