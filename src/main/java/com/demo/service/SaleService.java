package com.demo.service;

import com.demo.model.Sale;
import com.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    public SaleRepository saleRepository;

    public List<Sale> List() {
        return this.saleRepository.findAll();
    }

    public void Register(Sale input) {
        this.saleRepository.save(input);
    }

    public Optional<Sale> GetByDate(LocalDate date) {
        return this.saleRepository.findSaleByDate(date);
    }

    public Optional<Sale> GetById(Integer id) {
        return this.saleRepository.findSaleById(id);
    }
}
