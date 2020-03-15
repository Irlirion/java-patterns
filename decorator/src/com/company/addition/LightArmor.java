package com.company.addition;

import org.jetbrains.annotations.NotNull;

public class LightArmor extends PersonDecorator {
    LightArmor(@NotNull Person person) {
        this.person = person;
        person.setHealth(person.getHealth() + 50);
        person.setName(person.getName() + " with light armor");
    }
}
