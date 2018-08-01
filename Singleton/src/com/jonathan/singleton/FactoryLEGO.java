package com.jonathan.singleton;

public class FactoryLEGO {

    private static FactoryLEGO factory;

    private FactoryLEGO() { }

    public static synchronized FactoryLEGO getInstance(){
        if (factory == null)
            factory = new FactoryLEGO();
        return factory;
    }

    public LEGO getLEGO(String mountLEGO){
        switch (mountLEGO.toLowerCase()){
            case "house": return new HouseLEGO();
            case "airplane": return new AirplaneLEGO();
            default: System.out.println("Invalid command!");
        }
        return null;
    }
}