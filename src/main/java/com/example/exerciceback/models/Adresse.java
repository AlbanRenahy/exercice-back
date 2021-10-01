package com.example.exerciceback.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "adresse",
        uniqueConstraints = {
                @UniqueConstraint(name = "adresse_unique", columnNames = "numero")
        })
@Data
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero")
    private  String numero;

    @Column(name = "rue")
    private String rue;

    @Column(name = "cp")
    private String cp;

    @Column(name = "ville")
    private String ville;

    @ManyToOne
    @JoinColumn(name="adresse_id", referencedColumnName = "id")
    private Infirmiere infirmiere;

    @ManyToOne
    @JoinColumn(name="adresse_id", referencedColumnName = "id")
    private Patient patient;
}
