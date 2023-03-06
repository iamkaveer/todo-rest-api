package com.todoapp.todo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_todo")
public class Todo {
    @Id
    @Column(name = "todo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="todo_tittle")
    private String title;
    @Column(name="todo_status")
    private boolean status;
}