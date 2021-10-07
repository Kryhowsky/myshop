package com.kryhowsky.myshop.model.dto;

import com.kryhowsky.myshop.model.dao.Cart;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private Long id;
    private String brandOwner;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private String imgAddress;
    private Set<Cart> carts;

}
