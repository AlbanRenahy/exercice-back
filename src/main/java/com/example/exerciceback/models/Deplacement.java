package com.example.exerciceback.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table( name = "deplacement")
@Data
public class Deplacement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "cout")
    private Double cout;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="deplacement_id")
    private Set<Infirmiere> infirmieres;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Patient> patients;
}
