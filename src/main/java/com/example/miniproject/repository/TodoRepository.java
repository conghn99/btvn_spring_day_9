package com.example.miniproject.repository;

import com.example.miniproject.entiy.Todo;
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

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "update todo t set t.title=?2, t.status=?3 where t.id=?1")
    Todo updateTodoTitle(Integer id, String title, boolean status);

    void deleteById(Integer id);
}
