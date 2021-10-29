package com.ovcharenko.carrental.repositories;

import com.ovcharenko.carrental.model.RentalOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalOrderRepository extends JpaRepository<RentalOrder, Long> {
}
