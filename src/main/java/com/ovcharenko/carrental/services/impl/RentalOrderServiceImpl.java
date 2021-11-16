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
    public Optional<RentalOrder> findById(Long id) {
        return rentalOrderRepository.findById(id);
    }

    @Override
    public List<RentalOrder> findAll() {
        return rentalOrderRepository.findAll();
    }

    @Override
    public void save(RentalOrder rentalOrder) {
        rentalOrderRepository.save(rentalOrder);
    }

    @Override
    public void update(Long id, RentalOrder rentalOrder) {
        Optional<RentalOrder> rentalOrderFromDB = rentalOrderRepository.findById(id);
        if (!rentalOrderFromDB.isEmpty()) {
            RentalOrder existingRentalOrder = rentalOrderFromDB.get();
            existingRentalOrder.setUser(rentalOrder.getUser());
            existingRentalOrder.setCar(rentalOrder.getCar());
            existingRentalOrder.setStatus(rentalOrder.getStatus());
            existingRentalOrder.setStartDate(rentalOrder.getStartDate());
            existingRentalOrder.setEndDate(rentalOrder.getEndDate());
            existingRentalOrder.setTotalPrice(rentalOrder.getTotalPrice());
        }
    }

    @Override
    public void remove(Long id) {
        rentalOrderRepository.deleteById(id);
    }
}
