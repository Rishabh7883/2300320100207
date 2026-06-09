package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Depot;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service.DepotService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DepotController {

    private final DepotService depotService;

    public DepotController(DepotService depotService) {
        this.depotService = depotService;
    }

    @GetMapping("/evaluation-service/depots")
    public Map<String, List<Depot>> getDepots() {

        Map<String, List<Depot>> response =
                new HashMap<>();

        response.put(
                "depots",
                depotService.getDepots()
        );

        return response;
    }
}