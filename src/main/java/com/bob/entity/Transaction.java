package com.bob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Entity
@Table(name="transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id")
    @ToString.Exclude
    private User sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id")
    @ToString.Exclude
    private User receiver;

    @Column(name="booking")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name="appUser_id")
    @ToString.Exclude
    private User appUser;

    @OneToOne(mappedBy="transaction")
    @ToString.Exclude
    private Booking booking;
}
