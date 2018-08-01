package com.jonathan.method;

public abstract class CoffeMachine {

    final void templateMethod() {
        addIngredients();
        mixCoffe();
        heatCoffe();
    }

    abstract void addIngredients();
    abstract void mixCoffe();
    abstract void heatCoffe();
}