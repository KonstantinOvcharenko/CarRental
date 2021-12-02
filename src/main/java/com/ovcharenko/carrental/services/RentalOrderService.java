package com.ovcharenko.carrental.services;

import com.ovcharenko.carrental.model.RentalOrder;

import java.util.List;

public interface RentalOrderService {
    RentalOrder findById(Long id);

    List<RentalOrder> findAll();

    RentalOrder save(RentalOrder rentalOrder);

    void update(RentalOrder rentalOrder);

    void remove(Long id);
}
