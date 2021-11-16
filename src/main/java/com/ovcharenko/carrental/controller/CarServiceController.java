package com.ovcharenko.carrental.controller;

import com.ovcharenko.carrental.model.Car;
import com.ovcharenko.carrental.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarServiceController {
    @Autowired
    CarService carService;

    @RequestMapping(value = "/cars")
    public ResponseEntity<Object> getCars() {
        return new ResponseEntity<>(carService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getCar(@PathVariable("id") Long id) {
        return new ResponseEntity<>(carService.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    public ResponseEntity<Object> addCar(@RequestBody Car car) {
        carService.save(car);
        return new ResponseEntity<>("Car added successfully!", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateCar(@PathVariable("id") Long id, @RequestBody Car car) {
        carService.update(id, car);
        return new ResponseEntity<>("Car updated successfully!", HttpStatus.OK);
    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteCar(@PathVariable("id") Long id) {
        carService.remove(id);
        return new ResponseEntity<>("Car deleted successfully!", HttpStatus.OK);
    }
}
