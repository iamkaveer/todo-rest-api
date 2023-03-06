package com.todoapp.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
