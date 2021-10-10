package com.kryhowsky.myshop.mapper;

import com.kryhowsky.myshop.model.dao.User;
import com.kryhowsky.myshop.model.dto.UserDto;

public interface UserMapper {

    UserDto toDto(User user);
    User toDao(UserDto userDto);
}
