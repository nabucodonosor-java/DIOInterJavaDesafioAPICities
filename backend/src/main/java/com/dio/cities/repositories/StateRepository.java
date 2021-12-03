package com.dio.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.cities.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
