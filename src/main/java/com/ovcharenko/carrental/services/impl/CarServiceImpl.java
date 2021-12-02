package com.ovcharenko.carrental.services.impl;

import com.ovcharenko.carrental.model.Car;
import com.ovcharenko.carrental.repositories.CarRepository;
import com.ovcharenko.carrental.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public Car findById(Long id) {
        Optional<Car> optionalCar = carRepository.findById(id);
        return optionalCar.isPresent() ? optionalCar.get() : new Car();
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car save(Car car) {
        carRepository.save(car);
        return car;
    }

    @Override
    public void update(Car car) {
        carRepository.save(car);
    }

    @Override
    public void remove(Long id) {
        carRepository.deleteById(id);
    }
}
