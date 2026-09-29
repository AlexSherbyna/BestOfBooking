package com.bob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="booking")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "booking_status")
    private BookingStatus bookingStatus;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "time_start")
    private LocalDate timeStart;

    @Column(name = "time_end")
    private LocalDate timeEnd;

    @Column(name = "order_time")
    private LocalDate orderTime;

    @ManyToOne
    @JoinColumn(name="appUser_id")
    @ToString.Exclude
    private User appUser;

    @OneToOne
    @JoinColumn(name="transaction")
    @ToString.Exclude
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name="property")
    @ToString.Exclude
    private Property property;

}