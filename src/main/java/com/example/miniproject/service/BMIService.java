package com.example.miniproject.service;

import com.example.miniproject.exception.BadRequestException;
import com.example.miniproject.request.BMIRequest;
import org.springframework.stereotype.Service;

@Service
public class BMIService {
    public double calculateBmi(double height, double weight) {
        if(height <= 0 || weight <= 0) {
            throw new BadRequestException("Cân năng hoặc chiều cao phải > 0");
        }
        return weight / (height * height);
    }
}
