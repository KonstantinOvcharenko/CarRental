package com.ovcharenko.carrental.model;

import com.ovcharenko.carrental.enums.Status;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "RENTAL_ORDER")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RentalOrder {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carId")
    private Car car;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "startDate", columnDefinition = "DATE")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "endDate", columnDefinition = "DATE")
    private LocalDate endDate;

    @Column(name = "totalPrice")
    private BigDecimal totalPrice;

    @Column(name = "status")
    private Status status;
}
