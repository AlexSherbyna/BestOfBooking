package com.bob.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="homeowner")
@Data
public class Homeowner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="properties_id")
    private Integer propertiesID;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User my_user;

}
