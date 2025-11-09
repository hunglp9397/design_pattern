package com.hunglp.structure.decorator.issue;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Beverage {

    protected String description;

    protected boolean hasMilk;

    protected boolean hasSugar;

    public void printDescription() {
        System.out.println(this.description);
    }

    public double cost(){
        return 0.0;
    }
}
