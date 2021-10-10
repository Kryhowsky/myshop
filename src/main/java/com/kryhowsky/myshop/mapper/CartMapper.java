package com.kryhowsky.myshop.mapper;

import com.kryhowsky.myshop.model.dao.Cart;
import com.kryhowsky.myshop.model.dto.CartDto;

public interface CartMapper {

    CartDto toDto(Cart cart);
    Cart toDao(CartDto cartDto);

}
