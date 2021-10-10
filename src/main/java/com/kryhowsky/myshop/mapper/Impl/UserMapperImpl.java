package com.kryhowsky.myshop.mapper.Impl;

import com.kryhowsky.myshop.mapper.UserMapper;
import com.kryhowsky.myshop.model.dao.User;
import com.kryhowsky.myshop.model.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        return UserDto.builder()
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .carts(user.getCarts())
                .build();
    }

    @Override
    public User toDao(UserDto userDto) {
        return User.builder()
                .email(userDto.getEmail())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .password(userDto.getPassword())
                .carts(userDto.getCarts())
                .build();
    }
}
