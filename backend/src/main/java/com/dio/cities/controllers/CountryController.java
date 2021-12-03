package com.dio.cities.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.cities.entities.Country;
import com.dio.cities.repositories.CountryRepository;

@RestController
@RequestMapping("countries")
public class CountryController {
	
	@Autowired
	private CountryRepository repository;
	 
	@GetMapping
	public ResponseEntity<Page<Country>> findAllPaged(Pageable page) {
		Page<Country> list = repository.findAll(page);
		return ResponseEntity.ok().body(list);
	}

}
