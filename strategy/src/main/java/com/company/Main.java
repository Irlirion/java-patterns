package com.company;

import com.company.bad.*;
import com.company.good.InfoConfig;
import com.company.good.ModelDuck;
import com.company.good.FlyRocketPowered;
import com.company.my.Demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws IOException {
        testBad();
        testGood();
        Demo.main(args);
    }

    private static void testGood() {
        System.out.println("Testing good ducks...");
        List<com.company.good.Duck> goodDucks = new ArrayList<>();

        ApplicationContext context = new AnnotationConfigApplicationContext(InfoConfig.class);

        goodDucks.add(context.getBean(com.company.good.MallardDuck.class));
        goodDucks.add(context.getBean(com.company.good.ModelDuck.class));

        for (com.company.good.Duck duck: goodDucks) {
            duck.display();
            duck.performFly();
            duck.performQuack();
            duck.swim();
            System.out.println();
        }

        goodDucks.get(1).display();
        goodDucks.get(1).setFlyBehavior(new FlyRocketPowered());
        goodDucks.get(1).performFly();
    }

    private static void testBad() {
        System.out.println("Testing bad ducks...");
        List<Duck> badDucks = new ArrayList<>();

        badDucks.add(new MallardDuck());
        badDucks.add(new RedheadDuck());
        badDucks.add(new RubberDuck());
        badDucks.add(new DecoyDuck());

        for (Duck duck: badDucks) {
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
            System.out.println();
        }
        System.out.println();
    }

}
