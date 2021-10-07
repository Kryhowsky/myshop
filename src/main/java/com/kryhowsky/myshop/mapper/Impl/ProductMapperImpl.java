package com.kryhowsky.myshop.mapper.Impl;

import com.kryhowsky.myshop.mapper.ProductMapper;
import com.kryhowsky.myshop.model.dao.Product;
import com.kryhowsky.myshop.model.dto.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toDto(Product product) {
        return ProductDto.builder()
                .brandOwner(product.getBrandOwner())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .imgAddress(product.getImgAddress())
                .build();
    }

    @Override
    public Product toDao(ProductDto productDto) {
        return Product.builder()
                .brandOwner(productDto.getBrandOwner())
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .quantity(productDto.getQuantity())
                .imgAddress(productDto.getImgAddress())
                .build();
    }
}
