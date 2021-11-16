package com.ovcharenko.carrental.services.impl;

import com.ovcharenko.carrental.model.User;
import com.ovcharenko.carrental.repositories.UserRepository;
import com.ovcharenko.carrental.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void update(Long id, User user) {
        Optional<User> userFromDB = userRepository.findById(id);
        if (!userFromDB.isEmpty()) {
            User existingUser = userFromDB.get();
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            userRepository.save(existingUser);
        }
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
