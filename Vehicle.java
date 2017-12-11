package ru.levelup.tatiana_nesterova.qa.homework2;

import java.util.Calendar;

public abstract class Vehicle implements FuelUsage {
    private String name;
    private String color;
    private int year;
    private boolean isMoving = true; // by default is true
    private double price;

    private double fuelUsageItem; // fuel usage item for 100 km
    private double fuelUsage;

    public Vehicle() {
        // constructor
    }

    public Vehicle(String name, double price) {
        // constructor
        this.name = name;
        this.price = price;
    }

    public Vehicle(String name, double price, double fuel_usage_item) {
        // constructor
        this.name = name;
        this.price = price;
        this.fuelUsageItem = fuel_usage_item;
    }

    public Vehicle(String name, double price, double fuel_usage_item, String color, int year, boolean is_moving) {
        // constructor
        this.name = name;
        this.price = price;
        this.fuelUsageItem = fuel_usage_item;
        this.color = color;
        this.year = year;
        this.isMoving = is_moving;
    }

    public Vehicle(String name, String color, int year, boolean is_moving, double price, double fuel_usage_item, double fuel_usage) {
        // constructor
        this.name = name;
        this.color = color;
        this.year = year;
        this.isMoving = is_moving;
        this.price = price;
        this.fuelUsageItem = fuel_usage_item;
        this.fuelUsage = fuel_usage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setIsMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFuelUsageItem() {
        return fuelUsageItem;
    }

    public void setFuelUsageItem(double fuel_usage_item) {
        this.fuelUsageItem = fuel_usage_item;
    }

    public void setFuelUsage(double fuel_usage) {
        this.fuelUsage = fuelUsage;
    }

    @Override
    public double getFuelUsage() {
        return fuelUsage;
    }

    @Override
    public float calculateFuelUsageByDistance(int distance) {
        return (float)fuelUsageItem * distance / 100;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - this.getYear();
    }

    public boolean equalsByColor(String colorString) {
        return  (this.color == colorString.trim());
    }

    public boolean equalsByAgeIsMoving(Object obj) {
        if (!(obj instanceof Vehicle))
            return false;
        Vehicle ref = (Vehicle)obj;
        return (this.isMoving == ref.isMoving) && this.getAge()>0 && (this.getAge() >= ref.getAge());
    }
}
