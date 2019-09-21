package com.shtramak.msscbrewery.web.service;

import com.shtramak.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto save(BeerDto beerDto) {
        UUID generatedId = UUID.randomUUID();
        beerDto.setId(generatedId);
        return beerDto;
    }

    @Override
    public void update(BeerDto beerDto) {
        log.info("update method running...");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.info("delete method running...");
    }
}
