package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResultDto {

    private List<String> selectedTasks;
    private int totalImpact;
    private int totalHours;
}