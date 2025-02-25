package com.educandoweb.cursoSpringBoot.services;


import com.educandoweb.cursoSpringBoot.entities.Category;
import com.educandoweb.cursoSpringBoot.entities.Order;
import com.educandoweb.cursoSpringBoot.repositories.CategoryRepository;
import com.educandoweb.cursoSpringBoot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
