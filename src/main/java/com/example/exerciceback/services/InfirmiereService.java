package com.example.exerciceback.services;

import com.example.exerciceback.models.Infirmiere;

import java.util.List;
import java.util.Optional;

public interface InfirmiereService {
    public List<Infirmiere> findAll();
    public Optional<Infirmiere> findById(Long aLong);

    public void deleteById(Long aLong);
    public Infirmiere save(Infirmiere entity);
    public Infirmiere putInfirmiere(Infirmiere infirmiere);

}
