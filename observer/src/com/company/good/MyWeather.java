package com.company.good;

public class MyWeather implements WeatherNet {
    @Override
    public int getTemperature() {
        return (int) (Math.random() * 100) - 50;
    }

    @Override
    public int getHumidity() {
        return (int) (Math.random() * 100);
    }

    @Override
    public int getPressure() {
        return (int) (Math.random() * 26) + 740;
    }
}
