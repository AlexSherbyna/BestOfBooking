package com.bob.entity;

import jakarta.persistence.*;
import lombok.Data;

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

    @Column(name = "status_booking")
    private String statusBooking;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "time_start")
    private LocalDate timeStart;

    @Column(name = "time_end")
    private LocalDate timeEnd;

    @Column(name = "order_time")
    private LocalDate orderTime;

    @ManyToOne
    @JoinColumn(name="upuser_id")
    private User upuser;

    @OneToOne
    @JoinColumn(name="transaction")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name="property")
    private Property property;

}
