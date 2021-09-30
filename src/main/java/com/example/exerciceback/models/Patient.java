package com.example.exerciceback.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table( name = "patient")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "dateDeNaissance")
    private Date dateDeNaissance;

    @Column(name = "sexe")
    private  Enum sexe;

    @Column(name = "numeroSecuriteSociale")
    private BigInteger numero_securite_sociale;
}
