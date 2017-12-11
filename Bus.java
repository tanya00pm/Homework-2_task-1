package ru.levelup.tatiana_nesterova.qa.homework2;

public class Bus extends Vehicle{
    private String vin;
    private int seatsNumber;

    public Bus(String name, double price, String vin) {
        super(name, price);
        this.vin = vin;
    }

    public Bus(String vin, String name, double price, double fuel_usage_item, int seats_number) {
        super(name, price, fuel_usage_item);
        this.vin = vin;
        this.seatsNumber = seats_number;
    }

    public Bus(String vin, String name, double price, double fuel_usage_item, String color, int year, boolean is_moving) {
        super(name, price, fuel_usage_item, color, year, is_moving);
        this.vin = vin;
    }

    public Bus(String vin, String name, double price, double fuel_usage_item, int seats_number, String color, int year, boolean is_moving) {
        super(name, price, fuel_usage_item, color, year, is_moving);
        this.vin = vin;
        this.seatsNumber = seats_number;
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

    public void setSeatsNumber(int seats_number) {
        this.seatsNumber = seats_number;
    }
}
