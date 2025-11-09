package com.hunglp.structure.decorator.solution;

import com.hunglp.structure.decorator.solution.Beverage;

public abstract class Decorator extends Beverage {

    Beverage beverage;

    public Decorator(Size size) {
        super(size);
    }

    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }


}
