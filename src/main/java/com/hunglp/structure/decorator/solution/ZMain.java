package com.hunglp.structure.decorator.solution;

public class ZMain {
    public static void main(String[] args) {

        Beverage defaultDarkRoast = new DarkRoast(Size.SMALL);
        System.out.println(defaultDarkRoast.getDescription() + " | Size: " + defaultDarkRoast.getSize() + " | Cost :  " + defaultDarkRoast.cost());


        System.out.println("---");

        Beverage darkRoast_1 = new DarkRoast(Size.MEDIUM);
        darkRoast_1 = new Milk(darkRoast_1);
        System.out.println(darkRoast_1.getDescription()  + " | Size: " + darkRoast_1.getSize()  + " | Cost :  " + darkRoast_1.cost());


        System.out.println("---");

        Beverage darkRoast_2 = new DarkRoast(Size.LARGE);
        darkRoast_2 = new Sugar(darkRoast_2);
        darkRoast_2 = new Sugar(darkRoast_2);
//        darkRoast_2 = new Sugar(darkRoast_2); // Double Sugar :D
        System.out.println(darkRoast_2.getDescription()  + " | Size: " + darkRoast_2.getSize()  + " | Cost :  " + darkRoast_2.cost());
    }
}

