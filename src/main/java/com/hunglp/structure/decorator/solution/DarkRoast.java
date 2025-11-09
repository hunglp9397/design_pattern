package com.hunglp.structure.decorator.solution;

public class DarkRoast extends Beverage{

    public DarkRoast(Size size) {
        super(size);
        description = "DarkRoast";

    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        double cost = 2;
        if (size == Size.SMALL) {
            cost += 0.1;
        } else if (size == Size.MEDIUM) {
            cost += 0.2;
        } else if (size == Size.LARGE) {
            cost += 0.3;
        }
        return cost;
    }
}
