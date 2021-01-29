package com.demo.repository;

import com.demo.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface SaleRepository  extends JpaRepository<Sale, Integer> {
    Optional<Sale> findSaleByDate(LocalDate localDate);
    Optional<Sale> findSaleById(Integer integer);
}
