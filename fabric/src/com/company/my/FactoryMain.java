package com.company.my;


public class FactoryMain {

    public static void main(String[] args) {
        SexFactory factory = new SexFactory();
        ManFactory manFactory = factory.createHumanFactory(ManFactory.class);
        WomanFactory womanFactory = factory.createHumanFactory(WomanFactory.class);
        Woman blackWomen = womanFactory.createHuman(BlackWoman.class);
        blackWomen.getDesc();

        Man blackMan = manFactory.createHuman(BlackMan.class);
        blackMan.getDesc();
    }
}
