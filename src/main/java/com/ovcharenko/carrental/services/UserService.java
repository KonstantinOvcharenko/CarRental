package com.ovcharenko.carrental.services;

import com.ovcharenko.carrental.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();

    User save(User user);

    void update(User user);

    void remove(Long id);
}
