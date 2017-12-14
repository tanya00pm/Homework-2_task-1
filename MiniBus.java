package ru.levelup.tatiana_nesterova.qa.homework2.entities;

import ru.levelup.tatiana_nesterova.qa.homework2.entities.Bus;

public class MiniBus extends Bus {

    public MiniBus(String name, double price, String vin) {
        super(name, price, vin);
    }

    public MiniBus(String vin, String name, double price, double fuelUsageItem,  int seatsNumber) {
        super(vin, name, price, fuelUsageItem, seatsNumber);
    }

    public MiniBus(String vin, String name, double price, double fuelUsageItem,  String color, int year, boolean isMoving) {
        super(vin, name, price, fuelUsageItem, color, year, isMoving);
    }
}
