package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service;

import org.springframework.stereotype.Service;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.OptimizationResult;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Vehicle;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchedulerService {

    public OptimizationResult optimize(
            List<Vehicle> vehicles,
            int capacity) {

        int n = vehicles.size();

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {

            Vehicle v = vehicles.get(i - 1);

            for (int j = 0; j <= capacity; j++) {

                if (v.getDuration() <= j) {

                    dp[i][j] = Math.max(
                            dp[i - 1][j],
                            v.getImpact() +
                            dp[i - 1][j - v.getDuration()]
                    );
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        List<String> selectedTasks = new ArrayList<>();

        int totalDuration = 0;
        int j = capacity;

        for (int i = n; i > 0; i--) {

            if (dp[i][j] != dp[i - 1][j]) {

                Vehicle v = vehicles.get(i - 1);

                selectedTasks.add(v.getTaskId());

                totalDuration += v.getDuration();

                j -= v.getDuration();
            }
        }

        return new OptimizationResult(
                selectedTasks,
                dp[n][capacity],
                totalDuration
        );
    }
}
