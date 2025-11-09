package com.hunglp.behavior.strategy.good_solution;

public class MallardDuck extends Duck {

    public MallardDuck() {
        System.out.println("I am a Mallard Duck");
        quackBehavior = new Quack();
        flyBehavior = new FLyWithWings();
    }



}
