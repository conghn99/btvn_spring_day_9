package com.example.miniproject.repository;

import com.example.miniproject.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findAll();

    Todo save(Todo todo);

    void deleteById(Integer id);
}
