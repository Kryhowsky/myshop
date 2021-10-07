package com.kryhowsky.myshop.service.Impl;

import com.kryhowsky.myshop.model.dao.Product;
import com.kryhowsky.myshop.repository.ProductRepository;
import com.kryhowsky.myshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    @Transactional
    public Product update(Product product, Long id) {

        Product productDb = getProductById(id);
        productDb.setBrandOwner(product.getBrandOwner());
        productDb.setName(product.getName());
        productDb.setDescription(product.getDescription());
        productDb.setPrice(product.getPrice());
        productDb.setQuantity(product.getQuantity());
        productDb.setImgAddress(product.getImgAddress());
//        productDb.setCarts(product.getCarts());

        return productDb;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> getPage(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }
}
