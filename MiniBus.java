package ru.levelup.tatiana_nesterova.qa.homework2;

public class MiniBus extends Bus{

    public MiniBus(String name, double price, String vin) {
        super(name, price, vin);
    }

    public MiniBus(String vin, String name, double price, double fuel_usage_item,  int seats_number) {
        super(vin, name, price, fuel_usage_item, seats_number);
    }

    public MiniBus(String vin, String name, double price, double fuel_usage_item,  String color, int year, boolean is_moving) {
        super(vin, name, price, fuel_usage_item, color, year, is_moving);
    }
}
