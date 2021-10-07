package com.kryhowsky.myshop.model.dto;

import com.kryhowsky.myshop.model.dao.Product;
import com.kryhowsky.myshop.model.dao.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {

    private Long id;
    private User user;
    private Set<Product> products;

}
