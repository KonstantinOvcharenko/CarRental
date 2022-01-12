package com.ovcharenko.carrental.mappers;

import com.ovcharenko.carrental.dtos.CarDTO;
import com.ovcharenko.carrental.enums.Color;
import com.ovcharenko.carrental.model.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    public CarDTO toDto(Car car) {

        CarDTO dto = new CarDTO();
        dto.setId(car.getId());
        dto.setModel(car.getModel());
        dto.setPricePerDay(car.getPricePerDay());
        dto.setColor(car.getColor().name());
        return dto;
    }

    public Car toCar(CarDTO carDTO) {

        Car car = new Car();
        car.setId(carDTO.getId());
        car.setModel(carDTO.getModel());
        car.setPricePerDay(carDTO.getPricePerDay());
        car.setColor(Color.valueOf(carDTO.getColor()));
        return car;
    }
}
