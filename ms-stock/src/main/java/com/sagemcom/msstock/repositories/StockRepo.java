package com.sagemcom.msstock.repositories;

import com.sagemcom.msstock.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository <Stock, Long> {
}
