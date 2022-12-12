package com.example.miniproject.controller;

import com.example.miniproject.dto.UserDTO;
import com.example.miniproject.request.LogInRequest;
import com.example.miniproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public UserDTO login(@Valid @RequestParam LogInRequest request) {
        return userService.getUser(request);
    }
}
