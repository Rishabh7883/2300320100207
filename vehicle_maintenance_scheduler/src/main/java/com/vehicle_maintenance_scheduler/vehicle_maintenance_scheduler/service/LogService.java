package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class LogService {

    public void info(String message) {

        System.out.println(
                "[INFO] "
                        + LocalDateTime.now()
                        + " : "
                        + message
        );
    }

    public void error(String message) {

        System.out.println(
                "[ERROR] "
                        + LocalDateTime.now()
                        + " : "
                        + message
        );
    }
}