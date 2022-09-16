package com.nikhil.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.demo.model.TodoItems;

public interface Todorepo extends JpaRepository<TodoItems,Long>{

}
