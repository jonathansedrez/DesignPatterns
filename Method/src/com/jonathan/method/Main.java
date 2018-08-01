package com.jonathan.method;

public class Main {
    public static void main (String [] args){
        WhiteCoffe whiteCoffe = new WhiteCoffe();
        CoffeNormal coffeNormal = new CoffeNormal();

        whiteCoffe.templateMethod();
        coffeNormal.templateMethod();
    }
}