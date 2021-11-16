package com.ovcharenko.carrental.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

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
    private Enum color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Enum getColor() {
        return color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(model, car.model) && Objects.equals(pricePerDay, car.pricePerDay) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, pricePerDay, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", color=" + color +
                '}';
    }
}
