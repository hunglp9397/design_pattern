package com.hunglp.behavior.strategy.good_solution;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Can''t quack");
    }
}
