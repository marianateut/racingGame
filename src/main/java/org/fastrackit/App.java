package org.fastrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;
        //this is one-live comment
        Car car = new Car(engine);
        car.name = "Dacia ";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180.00;
        car.fuelType = "Gasoline";


        System.out.println(car.name);
        System.out.println(car.traveleDistance);
        System.out.println(car.running);
        System.out.println(car.engine);

        car.accelerate(60, 1);

        Engine engine2 = new Engine();
        engine2.manufacturer = "VW";
        engine2.capacity = 1600;
        Car car2 = new Car(engine2);
        car2.name = "Golf";
        car.name = "Skoda";
//        car.name = null;
        car = car2;
        //concatenation
        System.out.println("Car2 name:" + car2.name);
        System.out.println("Car1 name:" + car.name);


    }
}
