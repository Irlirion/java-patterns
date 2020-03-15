package com.company.bad;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I`m Rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
