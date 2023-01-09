package com.example.miniproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @Column(name = "status")
    private boolean status;
}
