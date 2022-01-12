package com.ovcharenko.carrental.model;

import com.ovcharenko.carrental.enums.Color;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CAR")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
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
    private Color color;
}
