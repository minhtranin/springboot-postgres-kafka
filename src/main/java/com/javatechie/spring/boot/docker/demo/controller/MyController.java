package com.javatechie.spring.boot.docker.demo.controller;

import com.javatechie.spring.boot.docker.demo.model.City;
import com.javatechie.spring.boot.docker.demo.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/showCities")
    public List<City> findCities(Model model) {

        List<City> cities = cityService.findAll();
        return cities;
    }
}
