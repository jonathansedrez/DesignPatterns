package com.jonathan.factory;

public class LEGOFactory {
    public LEGO getLEGO(String mountLEGO){
        switch (mountLEGO.toLowerCase()){
            case "house": return new HouseLEGO();
            case "airplane": return new AirplaneLEGO();
            default: System.out.println("Invalid command!");
        }
        return null;
    }
}