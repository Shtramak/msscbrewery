package com.shtramak.msscbrewery.web.service;

import com.shtramak.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto save(BeerDto beerDto);

    void update(BeerDto beerDto);

    void deleteById(UUID beerId);
}
