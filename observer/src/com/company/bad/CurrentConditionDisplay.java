package com.company.bad;

public class CurrentConditionDisplay {
    public void update(int temp, int humidity, int pressure) {
        System.out.println("Current Condition");
        System.out.println("Temperature: " + temp + "C degrees");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + " millimeters of mercury" + '\n');
    }
}
