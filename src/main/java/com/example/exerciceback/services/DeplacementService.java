package com.example.exerciceback.services;

import com.example.exerciceback.models.Adresse;
import com.example.exerciceback.models.Deplacement;
import com.example.exerciceback.models.Infirmiere;

import java.util.List;
import java.util.Optional;

public interface DeplacementService {
    public List<Deplacement> findAll();
    public Optional<Deplacement> findById(Long aLong);

    public void deleteById(Long aLong);
    public Deplacement save(Deplacement entity);
    public Deplacement putDeplacement(Deplacement deplacement);

}
