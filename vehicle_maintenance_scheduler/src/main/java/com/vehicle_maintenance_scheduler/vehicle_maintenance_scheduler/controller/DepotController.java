package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Depot;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.DepotService;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.LogService;

@RestController
public class DepotController {

    private final DepotService depotService;
    private final LogService logService;

    public DepotController(
            DepotService depotService,
            LogService logService) {

        this.depotService = depotService;
        this.logService = logService;
    }

    @GetMapping("/evaluation-service/depots")
    public Map<String, List<Depot>> getDepots() {

        logService.info("Fetching depots");

        Map<String, List<Depot>> response =
                new HashMap<>();

        response.put(
                "depots",
                depotService.getDepots()
        );

        return response;
    }
}