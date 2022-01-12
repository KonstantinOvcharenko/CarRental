package com.ovcharenko.carrental.mappers;

import com.ovcharenko.carrental.dtos.RentalOrderDTO;
import com.ovcharenko.carrental.enums.Status;
import com.ovcharenko.carrental.model.RentalOrder;
import org.springframework.stereotype.Component;

@Component
public class RentalOrderMapper {
    public RentalOrderDTO toDto(RentalOrder rentalOrder) {

        RentalOrderDTO dto = new RentalOrderDTO();
        dto.setId(rentalOrder.getId());
        dto.setUser(rentalOrder.getUser());
        dto.setCar(rentalOrder.getCar());
        dto.setStartDate(rentalOrder.getStartDate());
        dto.setEndDate(rentalOrder.getEndDate());
        dto.setTotalPrice(rentalOrder.getTotalPrice());
        dto.setStatus(rentalOrder.getStatus().name());
        return dto;
    }

    public RentalOrder toRentalOrder(RentalOrderDTO rentalOrderDTO) {

        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setId(rentalOrderDTO.getId());
        rentalOrder.setUser(rentalOrderDTO.getUser());
        rentalOrder.setCar(rentalOrderDTO.getCar());
        rentalOrder.setStartDate(rentalOrderDTO.getStartDate());
        rentalOrder.setEndDate(rentalOrderDTO.getEndDate());
        rentalOrder.setTotalPrice(rentalOrderDTO.getTotalPrice());
        rentalOrder.setStatus(Status.valueOf(rentalOrderDTO.getStatus()));
        return rentalOrder;
    }
}
