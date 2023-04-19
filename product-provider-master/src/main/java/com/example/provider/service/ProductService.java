package com.example.provider.service;


import com.example.provider.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts() ;
    Product getProductById(long id);
}
