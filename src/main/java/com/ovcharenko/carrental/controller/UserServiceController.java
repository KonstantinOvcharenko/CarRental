package com.ovcharenko.carrental.controller;

import com.ovcharenko.carrental.model.User;
import com.ovcharenko.carrental.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserServiceController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<User> getUsers() {
        return new ResponseEntity(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        return new ResponseEntity(userService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity("User added successfully!", HttpStatus.CREATED);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity updateUser(@RequestBody User user) {
        userService.update(user);
        return new ResponseEntity("User updated successfully!", HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity deleteUser(@PathVariable("id") Long id) {
        userService.remove(id);
        return new ResponseEntity("User deleted successfully!", HttpStatus.OK);
    }
}
