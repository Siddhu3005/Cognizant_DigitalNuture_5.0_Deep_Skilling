package com.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Country;

@RestController
public class CountryController {
	
	@GetMapping("/country")
	public Country getCountry() {
		return new Country("IND","INDIA");
	}
}
