package com.hunglp.structure.decorator.solution;

public class Milk extends Decorator {

    public Milk(Beverage beverage) {
        super(beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "_milk";
    }

    @Override
    public double cost() {

        return beverage.cost() + 0.8;
    }
}
