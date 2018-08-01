package com.jonathan.singleton;

public class Main {
    public static void main (String [] args){
        FactoryLEGO legoFactory = FactoryLEGO.getInstance();

        LEGO lego1 = legoFactory.getLEGO("house");
        lego1.mount();
        LEGO lego2 = legoFactory.getLEGO("Airplane");
        lego2.mount();
    }
}