package com.dio.cities.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.cities.entities.City;
import com.dio.cities.repositories.CityRepository;

@RestController
@RequestMapping("cities")
public class CityController {
	
	@Autowired
	private CityRepository repository;
	 
	@GetMapping
	  public ResponseEntity<Page<City>> cities(final Pageable page) {
	    Page<City> list = repository.findAll(page);		
		return ResponseEntity.ok().body(list);
	  }

}
