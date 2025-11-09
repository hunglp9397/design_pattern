package com.hunglp.behavior.strategy.bad_solution;

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("RedHeadDuck flying");
    }

    @Override
    public void quark() {
        System.out.println("RedHeadDuck quarking");
    }
}
