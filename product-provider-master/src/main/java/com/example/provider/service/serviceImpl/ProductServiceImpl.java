package com.example.provider.service.serviceImpl;

import com.example.provider.entities.Product;
import com.example.provider.service.ProductService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    private List<Product> products;

    public ProductServiceImpl() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/static/products.json");
            products = objectMapper.readValue(inputStream, new TypeReference<List<Product>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(long id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }


}
