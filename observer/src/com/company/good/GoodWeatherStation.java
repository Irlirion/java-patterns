package com.company.good;

public class GoodWeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new MyWeather());

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.changeMeasurements();
        weatherData.changeMeasurements();
        weatherData.changeMeasurements();
        weatherData.changeMeasurements();
    }
}
