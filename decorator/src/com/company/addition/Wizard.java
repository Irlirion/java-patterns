package com.company.addition;

public class Wizard extends Person {
    Wizard() {
        setName("Wizard");
        setIntelligence(100);
        setFightBehavior(new Staff());
    }
}
