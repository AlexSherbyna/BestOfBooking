package com.bob.entity;

import jakarta.persistence.*;
import lombok.Data;

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
    private String birthday;

    @Column(name="country")
    private String country;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="password")
    private String password;

    @OneToMany(mappedBy="appUser")
    private List<Homeowner> homeowner;

    @OneToMany(mappedBy="appUser")
    private List<Transaction> transaction;

    @OneToMany(mappedBy="appUser")
    private List<Booking> booking;
}
