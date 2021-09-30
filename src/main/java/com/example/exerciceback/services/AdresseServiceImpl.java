package com.example.exerciceback.services;

import com.example.exerciceback.models.Adresse;
import com.example.exerciceback.models.Infirmiere;
import com.example.exerciceback.models.Patient;
import com.example.exerciceback.repositories.AdresseRepository;
import com.example.exerciceback.repositories.InfirmiereRepository;
import com.example.exerciceback.repositories.PatientRepository;

import java.util.List;
import java.util.Optional;

public class AdresseServiceImpl implements AdresseService
{
    private AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository adresseRepository){
        this.adresseRepository = adresseRepository;
    }

    @Override
    public List<Adresse> findAll() {
        return this.adresseRepository.findAll();
    }

    @Override
    public Optional<Adresse> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        this.adresseRepository.deleteById(id);
    }

    @Override
    public Adresse save(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    @Override
    public Adresse putAdresse(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }
}
