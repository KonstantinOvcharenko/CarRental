package com.ovcharenko.carrental.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    private String model;
    private BigDecimal pricePerDay;

    private enum Color {
        BLACK, WHITE, GREY, RED, GREEN, BLUE, YELLOW, ORANGE;
    }
}
