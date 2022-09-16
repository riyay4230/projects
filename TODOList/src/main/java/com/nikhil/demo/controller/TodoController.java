package com.nikhil.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.demo.model.TodoItems;
import com.nikhil.demo.repo.Todorepo;

@RestController
@RequestMapping(value="/todo")
public class TodoController {

	@Autowired
	private Todorepo repo;
	@GetMapping
	public List<TodoItems> findAll(){
		return repo.findAll();
	}
	@PostMapping
	public TodoItems save(@Validated @NonNull @RequestBody TodoItems todo) {
		return repo.save(todo);
	}
	
	@PutMapping
	public TodoItems update(@Validated @NonNull @RequestBody TodoItems todo) {
		return repo.save(todo);
	}
	@DeleteMapping(value="/{id}")
	public String delete(@PathVariable Long id) {
		repo.deleteById(id);
		return "Deleted";
	}
	
}
