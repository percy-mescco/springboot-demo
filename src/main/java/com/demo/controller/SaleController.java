package com.demo.controller;

import com.demo.model.Sale;
import com.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping
    public List<Sale> List(){
        return this.saleService.List();
    }

    @PostMapping
    public void register(@RequestBody Sale input){
        this.saleService.Register(input);
    }

    @GetMapping("/getByDate/{date}")
    public Optional<Sale> GetByDate(@PathVariable("date") LocalDate date){
        return this.saleService.GetByDate(date);
    }

    @GetMapping("/getById/{id}")
    public Optional<Sale> GetById(@PathVariable("id") Integer id){
        return this.saleService.GetById(id);
    }
}
