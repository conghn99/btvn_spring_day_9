package com.example.miniproject.repository;

import com.example.miniproject.database.FakeDB;
import com.example.miniproject.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<User> getList() {
        return FakeDB.users;
    }
}
