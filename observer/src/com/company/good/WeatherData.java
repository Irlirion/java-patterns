package com.company.good;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private int temperature;
    private int humidity;
    private int pressure;
    private WeatherNet weatherNet;


    public WeatherData(WeatherNet weatherNet) {
        observers = new ArrayList<>();
        this.weatherNet = weatherNet;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o :
                observers) {
            o.update(temperature, humidity, pressure);
        }
        System.out.println();
    }

    void measurementsChanged() {
        notifyObserver();
    }

    void changeMeasurements() {
        this.temperature = weatherNet.getTemperature();
        this.humidity = weatherNet.getHumidity();
        this.pressure = weatherNet.getPressure();
        measurementsChanged();
    }

    public void setWeatherNet(WeatherNet weatherNet) {
        this.weatherNet = weatherNet;
    }
}
