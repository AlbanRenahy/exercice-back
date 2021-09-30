package com.example.exerciceback.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "deplacement")
@Data
public class Deplacement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "cout")
    private Double cout;
}
