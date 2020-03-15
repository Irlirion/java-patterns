package com.company.addition;

public class Knight extends Person{
    public Knight() {
        setName("Knight");
        setHealth(1000);
        setStrength(10);
        setFightBehavior(new Sword());
    }


}
