package com.jonathan.method;

public class CoffeNormal extends CoffeMachine{
    @Override
    void addIngredients(){
        System.out.println("adding milk...");
        System.out.println("adding coffe...");
    }

    @Override
    void mixCoffe(){
        System.out.println("Mixing...");
    }

    @Override
    void heatCoffe(){
        System.out.println("Heating coffe...");
        System.out.println("Thank you!");
    }
}