package com.kryhowsky.myshop.model.dao;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;
    private String firstName;
    private String lastName;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "user")
    private Set<Cart> carts;

}
