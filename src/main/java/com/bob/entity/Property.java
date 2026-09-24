package com.bob.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "property")
@Data
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "animals")
    private Byte animals;

    @Column(name = "room_flor")
    private Integer roomFlor;

    @Column(name = "room_number")
    private Integer roomNumber;

    @Column(name = "address")
    private String address;

    @OneToMany
    @JoinColumn(name="booking")
    private List<Booking> booking;
}
