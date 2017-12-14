package ru.levelup.tatiana_nesterova.qa.homework2;

import ru.levelup.tatiana_nesterova.qa.homework2.entities.*;

public class VehicleParkApplication {
    public static void main(String[] args) {

        VehicleParkApplication app = new VehicleParkApplication();
        app.startApplication();
    }

    public void startApplication() {

        Vehicle vehiclePark[] = {
                new Car("WL0HSJS00343", "Opel Corsa", 200000, 10, "red", 2007, false),
                new Car("WLHDWHUI092", "Hundai Solaris", 225000, 10, "green", 2009, false),
                new Bus("BSDJSK322343", "Hyundai Bogdan A 201", 2190000, 25, 24),
                new Bus ("WFSGF4322343", "Isuzu А-09206", 1910500, 20, 22, "red", 1997, true),
                new MiniBus("BSDJSK322343", "Toyota Verso", 450000, 12, 8),
                new MiniBus("QFDS94395454", "Mercedes-Benz Sprinter", 90000, 15, "white", 1991, false),
                new MiniBus("WHSLL534895", "Mercedes Sprinter Classic", 1250000, 17, 8),
        };

        VehiclePark park = new VehiclePark(vehiclePark);

        /* Sorting by fuel usage and calculate fuel usage for 230 km of each vehicle */
        System.out.println("Cars sorted by fuel usage:");
        park.sortCarsByFuelUsage();
        for (Vehicle v : vehiclePark) // print results after sorting
            System.out.println("fuel usage " + v.getFuelUsageItem() + "/100 km, " +
                    v.calculateFuelUsageByDistance(230) + "/230 km" + " : '" +
                    v.getName() + "' (" + v.getClass().getSimpleName() + ")");

        /* find vehicles by color attribute 'Red' */
        System.out.println("\nVehicles with Red color:");
        park.findCarsByColor("red");

        /* find vehicles by attributes 'Age' and 'IsMoving'*/
        System.out.println("\nVehicles with age >=10 and not moving:");
        park.findCarsByAgeAndMoving(10, false);

        /* Calculate car park cost */
        System.out.println("\nCar park cost is " + park.calculateParkCost() + " rubles.");
    }
}
