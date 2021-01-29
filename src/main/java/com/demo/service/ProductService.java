package com.demo.service;

import com.demo.model.Product;
import com.demo.repository.ClientRepository;
import com.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    public List<Product> List() {
        return this.productRepository.findAll();
    }

    public void Register(Product input) {
        this.productRepository.save(input);
    }

    public void Remove(Integer id) {
        this.productRepository.deleteById(id);
    }

    public void Update(Product input) {
        this.productRepository.save(input);
    }
}
