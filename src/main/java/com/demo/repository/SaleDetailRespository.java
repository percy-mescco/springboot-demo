package com.demo.repository;

import com.demo.model.Sale;
import com.demo.model.SaleDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SaleDetailRespository extends JpaRepository<SaleDetail, Integer> {
}
