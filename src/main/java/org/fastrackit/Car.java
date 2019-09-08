package org.fastrackit;
//mostenirea (is-a relationship)
public class Car extends AutoVehicle{
    int doorCount;
  // has -a relationship

    public Car(Engine engine) {
        super(engine);

    }
}
