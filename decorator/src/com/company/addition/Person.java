package com.company.addition;


public abstract class Person {
    private String name = "Person";
    private int health = 100;
    private int strength = 5;
    private int intelligence = 20;
    private boolean isDied = false;

    private IFightBehavior fightBehavior;

    public void fight(Person person) {
        if (isDied) {
            System.out.println(getName() + " is died. Let him rest...");
        } else if (person.isDied()){
            System.out.println(person.getName() + " is died. Let him rest...");
        }else {
            person.setHealth(person.getHealth() - fightBehavior.fight(strength, intelligence, getName(), person.getName()));
        }
    }

    public boolean isDied() {
        return isDied;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health <= 0) {
            this.health = 0;
            isDied = true;
            getDescription();
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setFightBehavior(IFightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public String getDescription() {
        if (isDied) {
            return "The " + getName() + " is died...";
        }
        return "The " + getName() + " with " + getHealth() + " Hp, " + getStrength() + " Sp, " + getIntelligence() + " Ip";
    }

}
