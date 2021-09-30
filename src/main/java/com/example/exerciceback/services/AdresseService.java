package com.example.exerciceback.services;

import com.example.exerciceback.models.Adresse;
import com.example.exerciceback.models.Infirmiere;

import java.util.List;
import java.util.Optional;

public interface AdresseService {
    public List<Adresse> findAll();
    public Optional<Adresse> findById(Long aLong);

    public void deleteById(Long aLong);
    public Adresse save(Adresse entity);
    public Adresse putAdresse(Adresse adresse);

}
