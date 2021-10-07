package com.kryhowsky.myshop.service;

import com.kryhowsky.myshop.model.dao.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    Product save(Product product);
    Product update(Product product, Long id);
    void delete(Long id);
    Page<Product> getPage(Pageable pageable);
    Product getProductById(Long id);

}
