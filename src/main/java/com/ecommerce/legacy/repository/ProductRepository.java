package com.ecommerce.legacy.repository;

import com.ecommerce.legacy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
