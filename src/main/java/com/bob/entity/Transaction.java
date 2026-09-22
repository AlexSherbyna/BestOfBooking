package com.bob.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="sender_id")
    private Long senderId;

    @Column(name="receiver_id")
    private Long receiverId;

    @Column(name="booking")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name="upuser_id")
    private User upuser;

    @OneToOne(mappedBy="transaction")
    private Booking booking;
}
