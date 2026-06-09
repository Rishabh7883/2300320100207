package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service;

import org.springframework.stereotype.Service;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Depot;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Vehicle;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {

    public Depot getDepot(){

        Depot depot = new Depot();
        depot.setId(1);
        depot.setMechanicHours(20);

        return depot;
    }

    public List<Vehicle> getVehicles(){

        List<Vehicle> list = new ArrayList<>();

        Vehicle v1 = new Vehicle();
        v1.setTaskID("T1");
        v1.setDuration(5);
        v1.setImpact(10);

        Vehicle v2 = new Vehicle();
        v2.setTaskID("T2");
        v2.setDuration(8);
        v2.setImpact(15);

        Vehicle v3 = new Vehicle();
        v3.setTaskID("T3");
        v3.setDuration(12);
        v3.setImpact(20);

        list.add(v1);
        list.add(v2);
        list.add(v3);

        return list;
    }
}
