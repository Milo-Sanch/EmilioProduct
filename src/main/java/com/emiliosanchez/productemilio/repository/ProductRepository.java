package com.emiliosanchez.productemilio.repository;

import com.emiliosanchez.productemilio.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}