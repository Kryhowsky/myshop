package com.kryhowsky.myshop.mapper.Impl;

import com.kryhowsky.myshop.mapper.CartMapper;
import com.kryhowsky.myshop.model.dao.Cart;
import com.kryhowsky.myshop.model.dto.CartDto;
import org.springframework.stereotype.Component;

@Component
public class CartMapperImpl implements CartMapper {

    @Override
    public CartDto toDto(Cart cart) {
        return CartDto.builder()
                .user(cart.getUser())
                .products(cart.getProducts())
                .build();
    }

    @Override
    public Cart toDao(CartDto cartDto) {
        return Cart.builder()
                .user(cartDto.getUser())
                .products(cartDto.getProducts())
                .build();
    }

}
