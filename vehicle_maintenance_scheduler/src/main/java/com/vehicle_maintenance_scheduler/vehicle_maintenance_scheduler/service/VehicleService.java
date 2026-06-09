package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Vehicle;

@Service
public class VehicleService {

    public List<Vehicle> getVehicles() {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle(UUID.randomUUID().toString(),1,5));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),6,2));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),1,3));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),5,5));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),7,3));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),6,3));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),9,8));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),4,6));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),3,2));
        vehicles.add(new Vehicle(UUID.randomUUID().toString(),8,10));

        return vehicles;
    }
}