package com.kryhowsky.myshop.mapper;

import com.kryhowsky.myshop.model.dao.Product;
import com.kryhowsky.myshop.model.dto.ProductDto;

public interface ProductMapper {

    ProductDto toDto(Product product);
    Product toDao(ProductDto productDto);
}
