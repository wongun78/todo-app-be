package com.in28minutes.rest.webservices.restfulwebservices.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;
import java.util.List;


public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByUsername(String username);

}
