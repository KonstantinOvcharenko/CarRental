package com.ovcharenko.carrental.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "pricePerDay")
    private BigDecimal pricePerDay;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private Enum color;
}
