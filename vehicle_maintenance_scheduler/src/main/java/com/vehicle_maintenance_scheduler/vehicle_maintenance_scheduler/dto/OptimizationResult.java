package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto;

import java.util.List;

public class OptimizationResult {

    private List<String> tasks;
    private int totalImpact;
    private int totalDuration;

    public OptimizationResult() {
    }

    public OptimizationResult(
            List<String> tasks,
            int totalImpact,
            int totalDuration) {

        this.tasks = tasks;
        this.totalImpact = totalImpact;
        this.totalDuration = totalDuration;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public int getTotalImpact() {
        return totalImpact;
    }

    public void setTotalImpact(int totalImpact) {
        this.totalImpact = totalImpact;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }
}