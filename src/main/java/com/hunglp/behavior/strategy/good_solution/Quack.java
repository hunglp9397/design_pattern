package com.hunglp.behavior.strategy.good_solution;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
