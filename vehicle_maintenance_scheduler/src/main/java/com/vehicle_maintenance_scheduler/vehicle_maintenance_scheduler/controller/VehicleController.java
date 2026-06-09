package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Vehicle;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.VehicleService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(
            VehicleService vehicleService) {

        this.vehicleService = vehicleService;
    }

    @GetMapping("/evaluation-service/vehicles")
    public Map<String, List<Vehicle>> getVehicles() {

        Map<String, List<Vehicle>> response =
                new HashMap<>();

        response.put(
                "vehicles",
                vehicleService.getVehicles()
        );

        return response;
    }
}
