package ru.levelup.tatiana_nesterova.qa.homework2.entities;

public class Car extends Vehicle {
    private String vin;

    public Car(String vin, String name, double price) {
        super(name, price);
        this.vin = vin;
    }

    public Car(String vin, String name, double price, double fuelUsage) {
        super(name, price, fuelUsage);
        this.vin = vin;
    }
    public Car(String vin, String name, double price, double fuelUsage, String color, int year, boolean isMoving) {
        super(name, price, fuelUsage, color, year, isMoving);
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
