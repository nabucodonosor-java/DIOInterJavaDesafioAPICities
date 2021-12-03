package com.dio.cities.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.cities.entities.State;
import com.dio.cities.repositories.StateRepository;

@RestController
@RequestMapping("/staties")
public class StateController {
	
	@Autowired
	private StateRepository repository;
	
	@GetMapping
	public ResponseEntity<Page<State>> findAll(Pageable page) {
		Page<State> list = repository.findAll(page);
		return ResponseEntity.ok().body(list);
	}
}
