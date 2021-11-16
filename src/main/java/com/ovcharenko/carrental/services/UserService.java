package com.ovcharenko.carrental.services;

import com.ovcharenko.carrental.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Long id);

    List<User> findAll();

    void save(User user);

    void update(Long id, User user);

    void remove(Long id);
}