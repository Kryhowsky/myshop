package com.kryhowsky.myshop.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(optional = false)
//    private User user;

//    @ManyToMany
//    @JoinTable(
//            name = "cart_product",
//            joinColumns = @JoinColumn(name = "cart_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id")
//    )
//    private Set<Product> products;
}
