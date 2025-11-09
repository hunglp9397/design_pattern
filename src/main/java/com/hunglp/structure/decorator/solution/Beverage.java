package com.hunglp.structure.decorator.solution;

public abstract class Beverage {
    String description = "Unknown Beverage";

    Size size;

    public String getDescription() {
        return description;
    }

    public Size getSize(){
        return size;
    }

    public Beverage(Size size){
        this.size = size;
    }



    public abstract double cost();
}
