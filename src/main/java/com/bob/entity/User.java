package com.bob.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="my_user")
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

    @OneToMany(mappedBy="my_user")
    private List<Homeowner> homeowner;
}
