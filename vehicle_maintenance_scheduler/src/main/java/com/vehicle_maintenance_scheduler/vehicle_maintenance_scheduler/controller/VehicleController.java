package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Vehicle;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.LogService;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.VehicleService;

@RestController
public class VehicleController {

    private final VehicleService vehicleService;
    private final LogService logService;

    public VehicleController(
            VehicleService vehicleService,
            LogService logService) {

        this.vehicleService = vehicleService;
        this.logService = logService;
    }

    @GetMapping("/evaluation-service/vehicles")
    public Map<String, List<Vehicle>> getVehicles() {

        logService.info("Fetching vehicles");

        Map<String, List<Vehicle>> response =
                new HashMap<>();

        response.put(
                "vehicles",
                vehicleService.getVehicles()
        );

        return response;
    }
}