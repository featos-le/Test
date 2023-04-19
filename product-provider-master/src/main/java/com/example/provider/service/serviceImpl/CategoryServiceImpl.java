package com.example.provider.service.serviceImpl;

import com.example.provider.entities.Category;
import com.example.provider.entities.Product;
import com.example.provider.service.CategoryService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final ObjectMapper objectMapper;
    @Autowired
    public CategoryServiceImpl(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }
    @Override
    public List<Category> getCategories() {
        Resource resource = new ClassPathResource("static/categories.json");
        InputStream inputStream = null;
        try {
            inputStream = resource.getInputStream();
            List<Category> categories = objectMapper.readValue(inputStream, new TypeReference<List<Category>>(){});
            return categories;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
