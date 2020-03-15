package com.company.addition;

public class Staff implements IFightBehavior {
    private int bonus = 50;

    @Override
    public int fight(int strength, int intelligence, String attacker, String enemy) {
        System.out.println("Stuff fired with a force " + (intelligence + bonus) + " to " + enemy + " from " + attacker);
        return intelligence + bonus;
    }
}
