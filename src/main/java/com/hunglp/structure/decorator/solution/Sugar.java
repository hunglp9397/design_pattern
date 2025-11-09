package com.hunglp.structure.decorator.solution;

public class Sugar extends Decorator{

    public Sugar(Beverage beverage) {
        super(beverage.getSize());

        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "_sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
