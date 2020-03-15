package com.company.bad;

public abstract class Duck {
    public void quack() {
        System.out.println("Quack!");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void fly() {
        System.out.println("Flying");
    }

    public abstract void display();

}
