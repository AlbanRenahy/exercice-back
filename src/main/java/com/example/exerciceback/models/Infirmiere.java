package com.example.exerciceback.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "infirmiere")
@Data
public class Infirmiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numeroProfessionnel")
    private  Integer numeroProfessionnel;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "telPro")
    private  Integer telPro;

    @Column(name = "telPerso")
    private  Integer telPerso;
}
