package com.ovcharenko.carrental.services.impl;

import com.ovcharenko.carrental.model.RentalOrder;
import com.ovcharenko.carrental.repositories.RentalOrderRepository;
import com.ovcharenko.carrental.services.RentalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentalOrderServiceImpl implements RentalOrderService {
    @Autowired
    private RentalOrderRepository rentalOrderRepository;

    @Override
    public RentalOrder findById(Long id) {
        Optional<RentalOrder> optionalRentalOrder = rentalOrderRepository.findById(id);
        return optionalRentalOrder.isPresent() ? optionalRentalOrder.get() : new RentalOrder();
    }

    @Override
    public List<RentalOrder> findAll() {
        return rentalOrderRepository.findAll();
    }

    @Override
    public RentalOrder save(RentalOrder rentalOrder) {
        rentalOrderRepository.save(rentalOrder);
        return rentalOrder;
    }

    @Override
    public void update(RentalOrder rentalOrder) {
        rentalOrderRepository.save(rentalOrder);
    }

    @Override
    public void remove(Long id) {
        rentalOrderRepository.deleteById(id);
    }
}
