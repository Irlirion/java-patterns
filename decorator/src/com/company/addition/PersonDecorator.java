package com.company.addition;

public abstract class PersonDecorator extends Person {
    public Person person;

    @Override
    public int getHealth() {
        return person.getHealth();
    }

    @Override
    public String getName() {
        return person.getName() ;
    }

    @Override
    public int getStrength() {
        return person.getStrength();
    }

    @Override
    public int getIntelligence() {
        return person.getIntelligence();
    }

    @Override
    public void setIntelligence(int intelligence) {
        person.setIntelligence(intelligence);
    }

    @Override
    public void setHealth(int health) {
        person.setHealth(health);
    }

    @Override
    public void fight(Person person) {
        this.person.fight(person);
    }

    @Override
    public String getDescription() {
        return person.getDescription();
    }

    @Override
    public boolean isDied() {
        return person.isDied();
    }

    @Override
    public void setFightBehavior(IFightBehavior fightBehavior) {
        person.setFightBehavior(fightBehavior);
    }
}
