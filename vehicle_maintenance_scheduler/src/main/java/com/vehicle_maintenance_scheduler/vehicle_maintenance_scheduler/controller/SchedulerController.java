package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Depot;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.ResultDto;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Vehicle;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.ApiService;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.OptimizationService;

import java.util.List;

@RestController
public class SchedulerController {

    private final ApiService apiService;
    private final OptimizationService optimizationService;

    public SchedulerController(
            ApiService apiService,
            OptimizationService optimizationService) {

        this.apiService = apiService;
        this.optimizationService = optimizationService;
    }

    @GetMapping("/schedule")
    public ResultDto schedule(){

        Depot depot = apiService.getDepot();

        List<Vehicle> vehicles =
                apiService.getVehicles();

        return optimizationService.optimize(
                vehicles,
                depot.getMechanicHours()
        );
    }
}
