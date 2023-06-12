package com.example.resttemplatetest.controller;


import com.example.resttemplatetest.model.SimpleBeerDto;
import com.example.resttemplatetest.service.BeerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/beers")
public class BeerController {

    private final BeerApiService beerApiService;

    @Autowired
    public BeerController(BeerApiService beerApiService) {
        this.beerApiService = beerApiService;
    }

    @GetMapping
    public SimpleBeerDto getFirstBeer() {
        return beerApiService.getBeers();
    }
}
