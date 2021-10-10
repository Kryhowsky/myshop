package com.kryhowsky.myshop.controller;

import com.kryhowsky.myshop.mapper.Impl.ProductMapperImpl;
import com.kryhowsky.myshop.model.dto.ProductDto;
import com.kryhowsky.myshop.service.Impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductServiceImpl productService;
    private final ProductMapperImpl productMapper;

    @PostMapping()
    public ProductDto saveProduct(@RequestBody ProductDto product) {
        return productMapper.toDto(productService.save(productMapper.toDao(product)));
    }

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return productMapper.toDto(productService.getProductById(id));
    }
}
