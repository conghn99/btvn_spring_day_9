package com.example.miniproject.database;

import com.example.miniproject.entity.User;

import java.util.ArrayList;
import java.util.List;

public class FakeDB {
    public static List<User> users = new ArrayList<>(List.of(
            new User(1, "user1", "user1@gmail.com", "user1123", "avatar1"),
            new User(1, "user2", "user2@gmail.com", "user2123", "avatar2"),
            new User(1, "user3", "user3@gmail.com", "user3123", "avatar3"),
            new User(1, "user4", "user4@gmail.com", "user4123", "avatar4"),
            new User(1, "user5", "user5@gmail.com", "user5123", "avatar5")
    ));
}