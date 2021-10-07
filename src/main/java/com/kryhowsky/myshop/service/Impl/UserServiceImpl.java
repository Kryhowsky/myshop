package com.kryhowsky.myshop.service.Impl;

import com.kryhowsky.myshop.model.dao.User;
import com.kryhowsky.myshop.repository.UserRepository;
import com.kryhowsky.myshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user, Long id) {

        User userDb = getUserById(id);
        userDb.setEmail(user.getEmail());
        userDb.setPassword(user.getPassword());
        userDb.setFirstName(user.getFirstName());
        userDb.setLastName(user.getLastName());
//        userDb.setCarts(user.getCarts());

        return userDb;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<User> getPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getById(id);
    }
}
