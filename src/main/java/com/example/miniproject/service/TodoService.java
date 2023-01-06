package com.example.miniproject.service;

import com.example.miniproject.exception.NotFoundException;
import com.example.miniproject.entiy.Todo;
import com.example.miniproject.repository.TodoRepository;
import com.example.miniproject.repository.UserRepository;
import com.example.miniproject.request.TodoRequestPut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodosList() {
        return todoRepository.findAll();
    }

    public Todo postTodo(String title) {
        return null;
    }

    public Todo updateTodo(int id, TodoRequestPut request) {
        return todoRepository.updateTodoTitle(id, request.getTitle(), request.isStatus());
    }

    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }
}
