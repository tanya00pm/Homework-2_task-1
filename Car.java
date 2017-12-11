package ru.levelup.tatiana_nesterova.qa.homework2;

public class Car extends Vehicle {
    private String vin;

    public Car(String vin, String name, double price) {
        super(name, price);
        this.vin = vin;
    }

    public Car(String vin, String name, double price, double fuel_usage) {
        super(name, price, fuel_usage);
        this.vin = vin;
    }
    public Car(String vin, String name, double price, double fuel_usage, String color, int year, boolean is_moving) {
        super(name, price, fuel_usage, color, year, is_moving);
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
