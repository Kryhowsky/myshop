package com.kryhowsky.myshop.repository;

import com.kryhowsky.myshop.model.dao.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
