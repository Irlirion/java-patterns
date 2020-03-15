package com.company.bad;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay {
    private int avgTemp;
    private int minTemp = 100;
    private int maxTemp = -100;
    private int sumTemp = 0;
    private int countTemp = 0;
    public void update(int temp, int humidity, int pressure) {
        sumTemp += temp;
        countTemp++;
        if (temp < minTemp) {
            minTemp = temp;
        }

        if (temp > maxTemp) {
            maxTemp = temp;
        }
        System.out.println("Statistics");
        System.out.println("Avg temp: " + Math.round((float) sumTemp / countTemp));
        System.out.println("Min temp: " + minTemp);
        System.out.println("Max temp: " + maxTemp + '\n');
    }
}
