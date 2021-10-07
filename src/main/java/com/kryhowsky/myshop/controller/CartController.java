package com.kryhowsky.myshop.controller;

import com.kryhowsky.myshop.model.dao.Cart;
import com.kryhowsky.myshop.service.Impl.CartServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
@RequiredArgsConstructor
public class CartController {

    private final CartServiceImpl cartService;

    @PostMapping()
    public Cart saveCart(@RequestBody Cart cart) {
        return cartService.save(cart);
    }

    @GetMapping("/{id}")
    public Cart getCartById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }
}
