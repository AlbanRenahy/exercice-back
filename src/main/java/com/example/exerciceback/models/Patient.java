package com.example.exerciceback.models;

import com.example.exerciceback.models.enums.Type;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "patient")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "dateDeNaissance")
    private Date dateDeNaissance;

    @Column(name = "sexe")
    @Enumerated(EnumType.STRING)
    private Type sexe;

    @Column(name = "numeroSecuriteSociale")
    private String numero_securite_sociale;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Infirmiere> infirmieres;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Adresse> adresses;

    @ManyToOne
    @JoinColumn(name="patient_id", referencedColumnName = "id")
    private Deplacement deplacement;
}
