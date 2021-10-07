package com.kryhowsky.myshop.service.Impl;

import com.kryhowsky.myshop.model.dao.Cart;
import com.kryhowsky.myshop.repository.CartRepository;
import com.kryhowsky.myshop.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    @Transactional
    public Cart update(Cart cart, Long id) {

        Cart cartDb = getCartById(id);
//        cartDb.setProducts(cart.getProducts());
//        cartDb.setUser(cart.getUser());

        return cartDb;
    }

    @Override
    public void delete(Long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Page<Cart> getPage(Pageable pageable) {
        return cartRepository.findAll(pageable);
    }

    @Override
    public Cart getCartById(Long id) {
        return cartRepository.getById(id);
    }

}
