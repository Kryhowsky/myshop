package com.kryhowsky.myshop.controller;

import com.kryhowsky.myshop.mapper.Impl.CartMapperImpl;
import com.kryhowsky.myshop.model.dto.CartDto;
import com.kryhowsky.myshop.service.Impl.CartServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
@RequiredArgsConstructor
public class CartController {

    private final CartServiceImpl cartService;
    private final CartMapperImpl cartMapper;

    @PostMapping()
    public CartDto saveCart(@RequestBody CartDto cart) {
        return cartMapper.toDto(cartService.save(cartMapper.toDao(cart)));
    }

    @GetMapping("/{id}")
    public CartDto getCartById(@PathVariable Long id) {
        return cartMapper.toDto(cartService.getCartById(id));
    }
}
