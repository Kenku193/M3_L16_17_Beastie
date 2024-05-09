package org.example.factory;

import org.example.factory.entity.Car;
import org.example.factory.entity.Vehicle;

public class CarFactory extends Vehicle {

    public Vehicle create(){
        return new Car();
    }

}
