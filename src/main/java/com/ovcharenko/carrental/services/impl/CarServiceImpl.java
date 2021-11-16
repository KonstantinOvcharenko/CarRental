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
    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void save(Car car) {
        carRepository.save(car);

    }

    @Override
    public void update(Long id, Car car) {
        Optional<Car> carFromDB = carRepository.findById(id);
        if (!carFromDB.isEmpty()) {
            Car existingCar = carFromDB.get();
            existingCar.setModel(car.getModel());
            existingCar.setColor(car.getColor());
            existingCar.setPricePerDay(car.getPricePerDay());
            carRepository.save(existingCar);
        }
    }

    @Override
    public void remove(Long id) {
        carRepository.deleteById(id);
    }
}
