package com.hunglp.structure.decorator.issue;

import lombok.AllArgsConstructor;
import lombok.Data;


public class DarkRoast extends Beverage {

    public DarkRoast(String description, boolean hasMilk, boolean hasSugar) {
        super(description, hasMilk, hasSugar);
    }



    @Override
    public double cost() {
        double darkRoastCost = 3.0;
        if(hasMilk){
            description += "_MILK";
            darkRoastCost += 1.5;
        }
        if(hasSugar){
            description += "_SUGAR";
            darkRoastCost += 1.0;
        }

        return super.cost() + darkRoastCost;
    }
}
