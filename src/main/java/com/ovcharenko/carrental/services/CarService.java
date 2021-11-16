package com.ovcharenko.carrental.services;

import com.ovcharenko.carrental.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    Optional<Car> findById(Long id);

    List<Car> findAll();

    void save(Car car);

    void update(Long id, Car Car);

    void remove(Long id);
}
