package com.example.miniproject.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ColorService {
    public String randomColor(int type) {
        return switch (type) {
            case 1 -> randomColorName();
            case 2 -> randomHexColor();
            case 3 -> randomRGBColor();
            default -> throw new RuntimeException("Type khong hop le");
        };
    }

    public String randomColorName() {
        List<String> colors = List.of("red", "black", "white", "gray", "blue", "green", "yellow");
        Random rd = new Random();
        return colors.get(rd.nextInt(colors.size()));
    }

    public String randomRGBColor() {
        Random rd = new Random();
        String r = String.valueOf(rd.nextInt(256));
        String g = String.valueOf(rd.nextInt(256));
        String b = String.valueOf(rd.nextInt(256));
        return "rgb(" + r + ", " + g + ", " + b + ")";
    }

    public String randomHexColor() {
        Random rd = new Random();
        int rand_num = rd.nextInt(0xffffff + 1);
        return String.format("#%06x", rand_num);
    }
}
