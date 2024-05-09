package org.example.factory;

import org.example.factory.entity.Boat;
import org.example.factory.entity.Vehicle;

public class BoatFactory extends Vehicle {
    public Vehicle create(){
        return new Boat();
    }
}

