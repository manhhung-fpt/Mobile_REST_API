package com.example.lab10.model;

import com.example.lab10.api.APIClient;

public class TraineeRepository {
    public static TraineeService getTraineeService() {
        return APIClient.getClient().create(TraineeService.class);
    }
}
