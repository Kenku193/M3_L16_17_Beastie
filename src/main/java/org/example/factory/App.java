package org.example.factory;

import org.example.factory.entity.Vehicle;

import java.util.List;

public class App {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle v = vehicleFactory.create("Car");
        System.out.println(v);



    }
}
