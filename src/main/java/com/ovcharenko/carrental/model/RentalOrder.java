package com.ovcharenko.carrental.model;

import javax.persistence.*;

@Entity
public class RentalOrder {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carId")
    private Car car;

    private enum Status {
        AVAILABLE, UNAVAILABLE, RENTED;
    }
}
