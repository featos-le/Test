package com.example.provider.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    private long id;
    private String title;
    private String description;
    private String brand;
    private String category;
    private String thumbnail;
    private double price;
    private double discountPercentage;
    private double rating;
    private long stock;
    private List<String> images;

}
