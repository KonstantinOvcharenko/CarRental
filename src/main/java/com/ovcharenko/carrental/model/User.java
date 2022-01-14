package com.ovcharenko.carrental.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
}
