package com.todoapp.todo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todoapp.todo.model.Todo;
import com.todoapp.todo.repository.TodoRepository;


@RestController
public class TodoController {
	@Autowired
	TodoRepository todoRepository;

	@GetMapping("/todos")
	public List<Todo> getAllTodos() {
		return todoRepository.findAll();
	}

	@PostMapping("/todos")
	public Todo createTodo(@RequestBody Todo todo) {
		return todoRepository.save(todo);
	}

	@GetMapping("/todos/{id}")
	public Optional<Todo> getTodoById(@PathVariable(value = "id") int todoId) {
		return todoRepository.findById(todoId);
	}
	
	@PutMapping("/todos/{id}")
	public Todo updateTodo(@PathVariable(value = "id") int todoId, @RequestBody Todo todoDetails) {
		Optional<Todo> todo = todoRepository.findById(todoId);
	     Todo updatedTodo = todo.get();
	     updatedTodo.setTitle(todoDetails.getTitle());
	     updatedTodo.setStatus(todoDetails.isStatus());
	     Todo savedTodo = todoRepository.save(updatedTodo);
	     return savedTodo;
	}
	
	@DeleteMapping("/todos/{id}")
	  public void deleteTodoById(@PathVariable(value = "id") int todoId) {
	     todoRepository.deleteById(todoId);
	  }

}
