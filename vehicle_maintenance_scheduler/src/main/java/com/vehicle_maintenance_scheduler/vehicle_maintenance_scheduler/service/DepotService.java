package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service;

import org.springframework.stereotype.Service;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Depot;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepotService {

    public List<Depot> getDepots() {

        List<Depot> depots = new ArrayList<>();

        depots.add(new Depot(1,60));
        depots.add(new Depot(2,135));
        depots.add(new Depot(3,188));
        depots.add(new Depot(4,97));
        depots.add(new Depot(5,164));

        return depots;
    }
}