package com.dio.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.cities.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
