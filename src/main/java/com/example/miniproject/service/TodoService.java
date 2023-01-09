package com.example.miniproject.service;

import com.example.miniproject.entity.Todo;
import com.example.miniproject.repository.TodoRepository;
import com.example.miniproject.request.TodoRequestPut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodosList() {
        return todoRepository.findAll();
    }

    public Todo postTodo(String title) {
        int id = todoRepository.findAll().get(todoRepository.findAll().size() - 1).getId() + 1;
        Todo newTodo = new Todo(id, title, false);
        return todoRepository.save(newTodo);
    }

    public Todo updateTodo(int id, TodoRequestPut request) {
        Todo newTodo = new Todo(id, request.getTitle(), request.isStatus());
        return todoRepository.save(newTodo);
    }

    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }
}
