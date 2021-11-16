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

    @RequestMapping(value = "/users")
    public ResponseEntity<Object> getUsers() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity<>("User added successfully!", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        userService.update(id, user);
        return new ResponseEntity<>("User updated successfully!", HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Long id) {
        userService.remove(id);
        return new ResponseEntity<>("User deleted successfully!", HttpStatus.OK);
    }
}
