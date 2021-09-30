package com.example.exerciceback.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name="infirmiere_id", referencedColumnName = "id")
    private Infirmiere infirmiere;

    @ManyToOne
    @JoinColumn(name="patient_id", referencedColumnName = "id")
    private Patient patient;
}
