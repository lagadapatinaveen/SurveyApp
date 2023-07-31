package com.example.ems.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String fname;
    private String lname;
    private String city;
}