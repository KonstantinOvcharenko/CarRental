package com.ovcharenko.carrental.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CAR")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Car {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "pricePerDay")
    private BigDecimal pricePerDay;

    @Column(name = "color")
    private Enum color;
}
