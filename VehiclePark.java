package ru.levelup.tatiana_nesterova.qa.homework2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Calendar;

public final class VehiclePark {
    Vehicle vehicles[];

    public VehiclePark(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public double calculateParkCost()
    {
        double parkCost=0;

        for (int i=0; i< vehicles.length-1; i++)
            parkCost += vehicles[i].getPrice();

        return  parkCost;

    }

    public void sortCarsByFuelUsage()
    {
        Arrays.sort(vehicles, new Comparator<Vehicle>() {
            public int compare(Vehicle a, Vehicle b) {
                double difference = a.getFuelUsageItem() - b.getFuelUsageItem();
                return ( difference < 0.0 ) ? -1 : ( difference > 0.0 ) ? 1 : 0;
            }
        });
    }

    public void findCarsByColor(String colorString)
    {
        for (Vehicle v : vehicles) {
            if(v.equalsByColor("red"))
                System.out.println("'"+v.getName()+"'");
        }
    }

    public void findCarsByAgeAndMoving(int fromAge, boolean isMoving)
    {
        Vehicle vehicleAttr = new Vehicle() {
        };
        Calendar calendar = Calendar.getInstance();
        vehicleAttr.setYear(calendar.get(Calendar.YEAR) - fromAge);
        vehicleAttr.setIsMoving(isMoving);

        for (Vehicle v : vehicles) {
            if(v.equalsByAgeIsMoving(vehicleAttr))
                System.out.println("'"+v.getName()+"': year = " + v.getYear());
        }
    }

}
