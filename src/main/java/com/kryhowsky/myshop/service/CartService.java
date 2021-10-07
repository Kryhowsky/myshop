package com.kryhowsky.myshop.service;

import com.kryhowsky.myshop.model.dao.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CartService {

    Cart save(Cart cart);
    Cart update(Cart cart, Long id);
    void delete(Long id);
    Page<Cart> getPage(Pageable pageable);
    Cart getCartById(Long id);

}
