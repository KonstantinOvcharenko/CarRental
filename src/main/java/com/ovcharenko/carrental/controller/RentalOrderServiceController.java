package com.ovcharenko.carrental.controller;

import com.ovcharenko.carrental.model.RentalOrder;
import com.ovcharenko.carrental.services.RentalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RentalOrderServiceController {
    @Autowired
    private RentalOrderService rentalOrderService;

    @GetMapping("/orders")
    public ResponseEntity<RentalOrder> getOrders() {
        return new ResponseEntity(rentalOrderService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity getOrder(@PathVariable("id") Long id) {
        return new ResponseEntity(rentalOrderService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/order")
    public ResponseEntity<RentalOrder> addOrder(@RequestBody RentalOrder order) {
        rentalOrderService.save(order);
        return new ResponseEntity("Rental order added successfully!", HttpStatus.OK);
    }

    @PutMapping("/order")
    public ResponseEntity updateOrder(@RequestBody RentalOrder order) {
        rentalOrderService.update(order);
        return new ResponseEntity("Rental order updated successfully!", HttpStatus.OK);
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity deleteOder(@PathVariable("id") Long id) {
        rentalOrderService.remove(id);
        return new ResponseEntity("Rental order deleted successfully!", HttpStatus.OK);
    }
}
