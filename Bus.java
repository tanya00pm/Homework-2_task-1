package ru.levelup.tatiana_nesterova.qa.homework2.entities;

public class Bus extends Vehicle {
    private String vin;
    private int seatsNumber;

    public Bus(String name, double price, String vin) {
        super(name, price);
        this.vin = vin;
    }

    public Bus(String vin, String name, double price, double fuelUsageItem, int seatsNumber) {
        super(name, price, fuelUsageItem);
        this.vin = vin;
        this.seatsNumber = seatsNumber;
    }

    public Bus(String vin, String name, double price, double fuelUsageItem, String color, int year, boolean isMoving) {
        super(name, price, fuelUsageItem, color, year, isMoving);
        this.vin = vin;
    }

    public Bus(String vin, String name, double price, double fuelUsageItem, int seatsNumber, String color, int year, boolean isMoving) {
        super(name, price, fuelUsageItem, color, year, isMoving);
        this.vin = vin;
        this.seatsNumber = seatsNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }
}
