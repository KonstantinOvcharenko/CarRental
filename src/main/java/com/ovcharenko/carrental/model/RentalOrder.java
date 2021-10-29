package com.ovcharenko.carrental.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "RENTAL_ORDER")
public class RentalOrder {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    @Column(name = "user")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carId")
    @Column(name = "car")
    private Car car;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "startDate", columnDefinition = "DATE")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "endDate", columnDefinition = "DATE")
    private LocalDate endDate;

    @Column(name = "totalPrice")
    private BigDecimal totalPrice;

    public enum Status {
        NEW, IN_PROGRESS, DONE;
    }
}
