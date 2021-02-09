package com.javatechie.spring.boot.docker.demo.repository;

import com.javatechie.spring.boot.docker.demo.model.City;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
