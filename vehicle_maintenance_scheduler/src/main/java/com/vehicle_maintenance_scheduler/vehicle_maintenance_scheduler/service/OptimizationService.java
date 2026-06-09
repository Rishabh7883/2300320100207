package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.service;

import org.springframework.stereotype.Service;

import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.ResultDto;
import com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.dto.Vehicle;

import java.util.ArrayList;
import java.util.List;

@Service
public class OptimizationService {

    public ResultDto optimize(List<Vehicle> vehicles,int capacity){

        int n = vehicles.size();

        int[][] dp = new int[n+1][capacity+1];

        for(int i=1;i<=n;i++){

            int duration = vehicles.get(i-1).getDuration();
            int impact = vehicles.get(i-1).getImpact();

            for(int w=0;w<=capacity;w++){

                if(duration<=w){
                    dp[i][w] =
                            Math.max(dp[i-1][w],
                                    impact + dp[i-1][w-duration]);
                }
                else{
                    dp[i][w]=dp[i-1][w];
                }
            }
        }

        List<String> selected = new ArrayList<>();

        int w = capacity;

        for(int i=n;i>0;i--){

            if(dp[i][w]!=dp[i-1][w]){

                selected.add(
                        vehicles.get(i-1).getTaskID()
                );

                w -= vehicles.get(i-1).getDuration();
            }
        }

        int hours=0;

        for(String task:selected){

            for(Vehicle v:vehicles){

                if(v.getTaskID().equals(task)){
                    hours+=v.getDuration();
                }
            }
        }

        return new ResultDto(
                selected,
                dp[n][capacity],
                hours
        );
    }
}
