package com.example.jparepository.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jparepository.entities.User;
import com.example.jparepository.repositories.UserRepository;

@RestController 
@RequestMapping(value ="/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> result = repository.findAll();
		return ResponseEntity.ok(result);
	}

}
