package com.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sample.models.Country;
import com.sample.services.CountryService;

@RestController
public class CountryController {
	private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {

        return service.getCountry(code);

    }
}
