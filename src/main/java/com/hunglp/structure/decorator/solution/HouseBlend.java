package com.hunglp.structure.decorator.solution;

public class HouseBlend extends Beverage{

    public HouseBlend(Size size) {
        super(size);
        description = "House Blend";

    }

    @Override
    public double cost() {
        int cost = 1;
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
