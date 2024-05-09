package org.example.factory;

import org.example.factory.BoatFactory;
import org.example.factory.CarFactory;
import org.example.factory.entity.Car;
import org.example.factory.entity.Vehicle;

public class VehicleFactory {

    Vehicle create(String vehicleType){

        Vehicle vehicle = switch (vehicleType){
            case "Car" -> new CarFactory().create();
            case "Boat" -> new BoatFactory().create();
            default -> new Car();
        };

        return vehicle;
    }

}
