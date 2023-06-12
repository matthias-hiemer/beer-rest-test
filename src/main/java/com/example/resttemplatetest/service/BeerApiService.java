package com.example.resttemplatetest.service;

import com.example.resttemplatetest.model.BeerApiDto;
import com.example.resttemplatetest.model.SimpleBeerDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BeerApiService {

    RestTemplate restTemplate = new RestTemplate();

    /**
     * Returns the first beer from the Punk Beer API
     * @return first beer
     */
    public SimpleBeerDto getBeers() {

        // 1) Call API: GET https://api.punkapi.com/v2/beers
        BeerApiDto[] response = restTemplate.getForObject("https://api.punkapi.com/v2/beers", BeerApiDto[].class);

        // 2) Get first beer
        BeerApiDto firstBeer = response[0];

        // 3) Map to SimpleBeerDto
        SimpleBeerDto simpleBeerDto = new SimpleBeerDto();
        simpleBeerDto.setName(firstBeer.getName());
        simpleBeerDto.setYeast(firstBeer.getIngredients().getYeast());

        return simpleBeerDto;
    }
}
