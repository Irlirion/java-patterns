package com.company.addition;

public class World {
    public static void main(String[] args) {
        Person knight = new Knight();
        System.out.println(knight.getDescription());
        knight = new LightArmor(knight);
        System.out.println(knight.getDescription());
        System.out.println();

        Person wizard = new Wizard();
        System.out.println(wizard.getDescription());
        wizard = new LightArmor(wizard);
        System.out.println(wizard.getDescription());
        wizard = new MagicArmor(wizard);
        System.out.println(wizard.getDescription());
        System.out.println();

        wizard.fight(knight);
        knight.fight(wizard);
        System.out.println(wizard.getDescription());
        System.out.println(knight.getDescription());
        System.out.println();

        wizard.fight(knight);
        knight.fight(wizard);
        System.out.println();

        knight = new TakeWizardStaff(knight);
        System.out.println(knight.getDescription());
        knight.fight(wizard);
        System.out.println(wizard.getDescription());
    }
}
