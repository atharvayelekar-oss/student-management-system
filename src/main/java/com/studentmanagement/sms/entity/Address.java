package com.studentmanagement.sms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String city;

    private String state;

    private String country;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}