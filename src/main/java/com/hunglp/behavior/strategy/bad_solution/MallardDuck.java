package com.hunglp.behavior.strategy.bad_solution;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    public void fly() {
        System.out.println("MallardDuck flying");
    }

    @Override
    public void quark() {
        System.out.println("MallardDuck quarking");
    }
}
