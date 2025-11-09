package com.hunglp.structure.decorator.issue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class HouseBlend extends Beverage{


    public HouseBlend(String description, boolean hasMilk, boolean hasSugar) {
        super(description, hasMilk, hasSugar);
    }

    @Override
    public double cost() {
        double houseBlendCost = 2.0;
        if(hasMilk){
            description += "_MILK";
            houseBlendCost += 1.5;
        }
        if(hasSugar){
            description += "_SUGAR";
            houseBlendCost += 1.0;
        }

        return super.cost() + houseBlendCost;
    }
}
