package com.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.CountryDao;
import com.sample.models.Country;

@Service
public class CountryService {

    @Autowired
    private CountryDao dao;

    public Country getCountry() {
        return dao.getCountry();
    }

}