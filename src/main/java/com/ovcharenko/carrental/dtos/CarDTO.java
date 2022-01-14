package com.ovcharenko.carrental.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private Long id;
    private String model;
    private BigDecimal pricePerDay;
    private String color;
}
