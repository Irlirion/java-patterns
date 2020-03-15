package com.company.good;

public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return 1;
    }

    public DarkRoast() {
        description = "Dark Roast";
    }
}
