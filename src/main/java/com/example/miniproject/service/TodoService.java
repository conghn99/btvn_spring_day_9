package com.example.miniproject.service;

import com.example.miniproject.exception.NotFoundException;
import com.example.miniproject.model.Todo;
import com.example.miniproject.request.TodoRequestPut;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> todos;

    public TodoService() {
        todos = new ArrayList<>();
        todos.add(new Todo(1, "Đi ngủ", true));
        todos.add(new Todo(2, "Đánh răng", true));
        todos.add(new Todo(3, "Rửa mặt", true));
        todos.add(new Todo(4, "Xem phim", false));
        todos.add(new Todo(5, "Ăn sáng", true));
        todos.add(new Todo(6, "Tán gái", false));
        todos.add(new Todo(7, "Lên bar", false));
        todos.add(new Todo(8, "Tham dự hội nghị", false));
        todos.add(new Todo(9, "Du lịch", false));
        todos.add(new Todo(10, "Ăn tối", true));
    }

    public List<Todo> getTodosList() {
        return todos;
    }

    public Todo postTodo(String title) {
        int id = todos.get(todos.size() - 1).getId() + 1;
        Todo todo = new Todo(id, title, false);
        todos.add(todo);
        return todo;
    }

    public Todo updateTodo(int id, TodoRequestPut request) {
        for (Todo todo : todos) {
            if(todo.getId() == id) {
                todo.setTitle(request.getTitle());
                todo.setStatus(request.isStatus());
                return todo;
            }
        }
        throw new NotFoundException("Not found todo with id " + id);
    }

    public void deleteTodo(int id) {
        if (!todos.removeIf(todo -> todo.getId() == id)) {
            throw new NotFoundException("Not found todo with id " + id);
        }
    }
}
