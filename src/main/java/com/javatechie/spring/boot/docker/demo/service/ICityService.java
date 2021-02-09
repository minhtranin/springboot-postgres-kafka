package com.javatechie.spring.boot.docker.demo.service;

import com.javatechie.spring.boot.docker.demo.model.City;

import java.util.List;

public interface ICityService {

    List<City> findAll();
}
