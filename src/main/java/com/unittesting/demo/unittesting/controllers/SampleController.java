package com.unittesting.demo.unittesting.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/getSampleData")
    public String sampleData() {
        return "Sample Data";
    }
}
