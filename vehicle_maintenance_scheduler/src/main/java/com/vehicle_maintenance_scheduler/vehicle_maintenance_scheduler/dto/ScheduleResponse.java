package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto;


import java.util.List;

public class ScheduleResponse {

    private int depotId;
    private int mechanicHours;
    private int totalDuration;
    private int totalImpact;
    private List<String> selectedTasks;

    public ScheduleResponse() {
    }

    public ScheduleResponse(
            int depotId,
            int mechanicHours,
            int totalDuration,
            int totalImpact,
            List<String> selectedTasks) {

        this.depotId = depotId;
        this.mechanicHours = mechanicHours;
        this.totalDuration = totalDuration;
        this.totalImpact = totalImpact;
        this.selectedTasks = selectedTasks;
    }

    public int getDepotId() {
        return depotId;
    }

    public void setDepotId(int depotId) {
        this.depotId = depotId;
    }

    public int getMechanicHours() {
        return mechanicHours;
    }

    public void setMechanicHours(int mechanicHours) {
        this.mechanicHours = mechanicHours;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public int getTotalImpact() {
        return totalImpact;
    }

    public void setTotalImpact(int totalImpact) {
        this.totalImpact = totalImpact;
    }

    public List<String> getSelectedTasks() {
        return selectedTasks;
    }

    public void setSelectedTasks(List<String> selectedTasks) {
        this.selectedTasks = selectedTasks;
    }
}
