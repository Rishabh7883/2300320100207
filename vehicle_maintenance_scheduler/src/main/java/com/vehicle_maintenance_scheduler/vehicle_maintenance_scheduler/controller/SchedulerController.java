package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Depot;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.OptimizationResult;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.ScheduleResponse;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Vehicle;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.DepotService;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.SchedulerService;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.VehicleService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SchedulerController {

    private final DepotService depotService;
    private final VehicleService vehicleService;
    private final SchedulerService schedulerService;

    public SchedulerController(
            DepotService depotService,
            VehicleService vehicleService,
            SchedulerService schedulerService) {

        this.depotService = depotService;
        this.vehicleService = vehicleService;
        this.schedulerService = schedulerService;
    }

    @GetMapping("/api/schedule")
    public List<ScheduleResponse> schedule() {

        List<Depot> depots =
                depotService.getDepots();

        List<Vehicle> vehicles =
                vehicleService.getVehicles();

        List<ScheduleResponse> responses =
                new ArrayList<>();

        for (Depot depot : depots) {

            OptimizationResult result =
                    schedulerService.optimize(
                            vehicles,
                            depot.getMechanicHours()
                    );

            responses.add(
                    new ScheduleResponse(
                            depot.getId(),
                            depot.getMechanicHours(),
                            result.getTotalDuration(),
                            result.getTotalImpact(),
                            result.getTasks()
                    )
            );
        }

        return responses;
    }
}