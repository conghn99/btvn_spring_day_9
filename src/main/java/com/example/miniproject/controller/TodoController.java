package com.example.miniproject.controller;

import com.example.miniproject.entiy.Todo;
import com.example.miniproject.request.TodoRequestPost;
import com.example.miniproject.request.TodoRequestPut;
import com.example.miniproject.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("todos")
    public List<Todo> getTodoList() {
        return todoService.getTodosList();
    }

    @PostMapping("todos")
    public Todo postTodo(@RequestBody TodoRequestPost request) {
        return todoService.postTodo(request.getTitle());
    }

    @PutMapping("todos/{id}")
    public Todo putTodo(@PathVariable int id, @RequestBody TodoRequestPut request) {
        return todoService.updateTodo(id, request);
    }

    @DeleteMapping("todos/{id}")
    public void deleteTodo(@PathVariable int id) {
        todoService.deleteTodo(id);
    }
}
