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

    @RequestMapping(value = "/orders")
    public ResponseEntity<Object> getOrders() {
        return new ResponseEntity<>(rentalOrderService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getOrder(@PathVariable("id") Long id) {
        return new ResponseEntity<>(rentalOrderService.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public ResponseEntity<Object> addOrder(@RequestBody RentalOrder order) {
        rentalOrderService.save(order);
        return new ResponseEntity<>("Rental order added successfully!", HttpStatus.OK);
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateOrder(@PathVariable("id") Long id, @RequestBody RentalOrder order) {
        rentalOrderService.update(id, order);
        return new ResponseEntity<>("Rental order updated successfully!", HttpStatus.OK);
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteOder(@PathVariable("id") Long id) {
        rentalOrderService.remove(id);
        return new ResponseEntity<>("Rental order deleted successfully!", HttpStatus.OK);
    }
}
