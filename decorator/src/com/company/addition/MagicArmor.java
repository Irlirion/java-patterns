package com.company.addition;

import org.jetbrains.annotations.NotNull;

public class MagicArmor extends PersonDecorator {
    MagicArmor(@NotNull Person person) {
        this.person = person;
        person.setIntelligence(person.getIntelligence() + 50);
    }
}
