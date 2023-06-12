package com.example.resttemplatetest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerApiDto {

    @JsonProperty("name")
    private String name;

    @JsonProperty("first_brewed")
    private String firstBrewed;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("food_pairing")
    private String[] foodPairing;

    private Ingredients ingredients;


}
