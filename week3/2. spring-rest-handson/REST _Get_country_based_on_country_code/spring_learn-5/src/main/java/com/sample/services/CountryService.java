package com.sample.services;
import com.sample.models.*;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private List<Country> ls=new ArrayList<>();

    public CountryService() {
        ls.add(new Country("IND", "India"));
        ls.add(new Country("JP", "Japan"));
        ls.add(new Country("AUS", "Australia"));
        ls.add(new Country("PAK", "PAKISTAN"));

    }

    public Country getCountry(String code) {
        return ls.stream()
                .filter(country->country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);

    }
}
