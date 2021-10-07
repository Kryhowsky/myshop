package com.kryhowsky.myshop.repository;

import com.kryhowsky.myshop.model.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
