package com.hunglp.structure.decorator.issue;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Beverage("Beverage", false, false);
        System.out.println("Cost: " + beverage.cost());
        beverage.printDescription();

        System.out.println("--------------");

        Beverage darkRoast = new DarkRoast("Dark Roast", true, false);
        System.out.println("Cost: " + darkRoast.cost());
        darkRoast.printDescription();

        System.out.println("--------------");

        Beverage houseBlend = new HouseBlend("HouseBlend", true, true);
        System.out.println("Cost: " + houseBlend.cost());
        houseBlend.printDescription();
    }
}
