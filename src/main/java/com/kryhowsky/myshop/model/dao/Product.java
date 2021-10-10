package com.kryhowsky.myshop.model.dao;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brandOwner;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private String imgAddress;

    @ManyToMany(mappedBy = "products")
    private Set<Cart> carts;

}
