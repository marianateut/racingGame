package org.fastrackit;

public class Vehicle {

   private static int totalCount;

  private String name;
  private Double mileage;
  private Double maxSpeed;
  private String fuelType;
  private double fuelLevel;
  private double traveleDistance;
  private boolean running;

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + "is accelerating with" + speed + "km/h for" + durationInHours + "h.");
        double distance = speed * durationInHours;
        System.out.println("Distance:" + distance);
        traveleDistance = traveleDistance + distance;
        //same result as the above stament
//        traveledDistance += distance;
        double usedFuel = distance * mileage / 100;
        System.out.println("used fuel:" + usedFuel);
        usedFuel -= usedFuel;
        System.out.println("Remaining fuel:" + fuelLevel);
        return distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveleDistance() {
        return traveleDistance;
    }

    public void setTraveleDistance(double traveleDistance) {
        this.traveleDistance = traveleDistance;
    }

    public boolean isRunning() {
        return running;
    }



    public void setRunning(boolean running) {
        this.running = running;



    }

    public static int getTotalCount() {
        return totalCount;
    }
}
