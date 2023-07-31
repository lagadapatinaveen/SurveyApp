package com.example.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="survey")
public class Survey {
    @Id
    private int sid;
    private String fname;
    private String lname;
    private String city;
}