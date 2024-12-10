package com.example.t2305m_springboot.service;

import com.example.t2305m_springboot.entity.Category;
import com.example.t2305m_springboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> all(){
        return categoryRepository.findAll();
    }

    public Category create(Category category){
        return categoryRepository.save(category);
    }
}
