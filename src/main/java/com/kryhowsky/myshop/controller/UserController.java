package com.kryhowsky.myshop.controller;

import com.kryhowsky.myshop.mapper.Impl.UserMapperImpl;
import com.kryhowsky.myshop.model.dto.UserDto;
import com.kryhowsky.myshop.service.Impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceImpl userService;
    private final UserMapperImpl userMapper;

    @PostMapping
    public UserDto saveUser(@RequestBody UserDto user) {
        return userMapper.toDto(userService.save(userMapper.toDao(user)));
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        return userMapper.toDto(userService.getUserById(id));
    }
}
