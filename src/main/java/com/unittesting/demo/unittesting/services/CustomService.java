package com.unittesting.demo.unittesting.services;

import java.util.Arrays;

public class CustomService {

    private DataService dataService;

    public int calculateSum(int[] arr) {
       return Arrays.stream(arr).sum();
    }

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    public int calculateUsingDataService() {
        int[] data = dataService.retrieveData();
        return Arrays.stream(data).sum();
    }
}
