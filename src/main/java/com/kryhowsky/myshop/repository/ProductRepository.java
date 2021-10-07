package com.kryhowsky.myshop.repository;

import com.kryhowsky.myshop.model.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
