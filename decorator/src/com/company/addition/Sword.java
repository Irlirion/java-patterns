package com.company.addition;

public class Sword implements IFightBehavior {

    @Override
    public int fight(int strength, int intelligence, String attacker, String enemy) {
        int bonus = 50;
        System.out.println("Sword strike with a force " + (strength + bonus) + " to " + enemy + " from " + attacker);
        return strength + bonus;
    }
}
