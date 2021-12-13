package com.ovcharenko.carrental.services;

import com.ovcharenko.carrental.model.Car;

import java.util.List;

public interface CarService {
    Car findById(Long id);

    List<Car> findAll();

    Car save(Car car);

    void update(Car car);

    void remove(Long id);
}
