package com.bob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="appUser")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="second_name")
    private String secondName;

    @Column(name="birthday")
    private LocalDate birthday;

    @Column(name="country")
    private String country;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="password")
    private String password;

    @OneToMany(mappedBy="appUser")
    @ToString.Exclude
    private List<Homeowner> homeowner;

    @OneToMany(mappedBy="appUser")
    @ToString.Exclude
    private List<Transaction> transaction;

    @OneToMany(mappedBy="appUser")
    @ToString.Exclude
    private List<Booking> booking;
}
