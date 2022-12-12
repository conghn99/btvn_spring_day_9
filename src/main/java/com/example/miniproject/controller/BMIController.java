package com.example.miniproject.controller;

import com.example.miniproject.request.BMIRequest;
import com.example.miniproject.service.BMIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BMIController {
    @Autowired
    private BMIService bmiService;

    @GetMapping("/bmi-get")
    public double calculateBmiGet(@RequestParam double height, @RequestParam double weight) {
        return bmiService.calculateBmi(height, weight);
    }

    @PostMapping("/bmi-post")
    public double calculateBmiPost(@RequestBody BMIRequest request) {
        return bmiService.calculateBmi(request.getHeight(), request.getWeight());
    }
}
