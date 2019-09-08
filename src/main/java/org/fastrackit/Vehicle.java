package org.fastrackit;

public class Vehicle {
    String name;
    Double mileage;
    Double maxSpeed;
    String fuelType;
    double fuelLevel;
    double traveleDistance;
    boolean running;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + "is accelerating with" + speed + "km/h for" + durationInHours + "h.");
        double distance = speed * durationInHours;
        System.out.println("Distance:" + distance);
        traveleDistance = traveleDistance + distance;
        //same result as the above stament
//        traveleDistance += distance;
        double usedFuel = distance * mileage / 100;
        System.out.println("used fuel:" + usedFuel);
        usedFuel -= usedFuel;
        System.out.println("Remaining fuel:" + fuelLevel);
        return distance;
    }
}
