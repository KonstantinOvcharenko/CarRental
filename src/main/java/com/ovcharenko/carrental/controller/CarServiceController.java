package com.ovcharenko.carrental.controller;

import com.ovcharenko.carrental.model.Car;
import com.ovcharenko.carrental.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarServiceController {
    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getCars() {
        return new ResponseEntity<>(carService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/car/{id}")
    public ResponseEntity<Car> getCar(@PathVariable("id") Long id) {
        return new ResponseEntity(carService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/car")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        carService.save(car);
        return new ResponseEntity("Car added successfully!", HttpStatus.CREATED);
    }

    @PutMapping("/car")
    public ResponseEntity updateCar(@RequestBody Car car) {
        carService.update(car);
        return new ResponseEntity("Car updated successfully!", HttpStatus.OK);
    }

    @DeleteMapping("/car/{id}")
    public ResponseEntity deleteCar(@PathVariable("id") Long id) {
        carService.remove(id);
        return new ResponseEntity("Car deleted successfully!", HttpStatus.OK);
    }
}
