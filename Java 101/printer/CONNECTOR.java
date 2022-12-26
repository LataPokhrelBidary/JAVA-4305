package com.company;

public class CONNECTOR {
    private  String model;
    private  String manufacturer;
    private String powerSupply;

    public CONNECTOR(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power Button Is Pressed");

    }
}
