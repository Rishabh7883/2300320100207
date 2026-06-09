package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto;

import lombok.Data;

@Data
public class Vehicle {

    private String taskID;
    private int duration;
    private int impact;
}
