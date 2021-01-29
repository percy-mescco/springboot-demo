package com.demo.controller;

import com.demo.model.Product;
import com.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> List(){
        return this.productService.List();
    }

    @PostMapping
    public void register(@RequestBody Product input){
        this.productService.Register(input);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Integer id){
        this.productService.Remove(id);
    }

    @PutMapping(path = "{id}")
    public void update(@RequestBody Product input)
    {
        this.productService.Update(input);
    }
}
