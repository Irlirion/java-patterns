package com.company.addition;

import org.jetbrains.annotations.NotNull;

public class TakeWizardStaff extends PersonDecorator {
    TakeWizardStaff(@NotNull Person person) {
        this.person = person;
        person.setFightBehavior(new Staff());
    }
}
