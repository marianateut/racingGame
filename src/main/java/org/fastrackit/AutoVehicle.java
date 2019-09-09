package org.fastrackit;

public class AutoVehicle extends Vehicle{
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
    //constractor overloading
    public AutoVehicle() {
      //  this.engine = new Engine();
        this(new Engine());
    }
}
