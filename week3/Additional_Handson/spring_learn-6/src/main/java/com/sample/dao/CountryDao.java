package com.sample.dao;

import org.springframework.stereotype.Repository;

import com.sample.models.Country;

@Repository
public class CountryDao {

    public Country getCountry() {
        return new Country("IN", "India");
    }

}