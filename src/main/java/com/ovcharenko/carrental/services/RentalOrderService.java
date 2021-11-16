package com.ovcharenko.carrental.services;

import com.ovcharenko.carrental.model.RentalOrder;

import java.util.List;
import java.util.Optional;

public interface RentalOrderService {
    Optional<RentalOrder> findById(Long id);

    List<RentalOrder> findAll();

    void save(RentalOrder rentalOrder);

    void update(Long id, RentalOrder rentalOrder);

    void remove(Long id);
}
