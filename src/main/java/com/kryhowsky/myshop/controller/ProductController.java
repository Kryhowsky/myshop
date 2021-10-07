package com.kryhowsky.myshop.controller;

import com.kryhowsky.myshop.mapper.Impl.ProductMapperImpl;
import com.kryhowsky.myshop.model.dao.Product;
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
    public Product saveProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

//    @GetMapping("/{id}")
//    public ProductDto getProductById(@PathVariable Long id) {
//        return productMapper.toDto(productService.getProductById(id));
//    }
}
