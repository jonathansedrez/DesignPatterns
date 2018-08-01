package com.jonathan.factory;

public class Main {
    public static void main (String [] args){
        LEGOFactory legoFactory = new LEGOFactory();

        LEGO lego1 = legoFactory.getLEGO("house");
        lego1.mount();
        LEGO lego2 = legoFactory.getLEGO("Airplane");
        lego2.mount();
    }
}