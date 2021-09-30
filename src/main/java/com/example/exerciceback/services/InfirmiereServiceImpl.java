package com.example.exerciceback.services;

import com.example.exerciceback.models.Infirmiere;
import com.example.exerciceback.repositories.InfirmiereRepository;

import java.util.List;
import java.util.Optional;

public class InfirmiereServiceImpl implements InfirmiereService
{
    private InfirmiereRepository infirmiereRepository;

    public InfirmiereServiceImpl(InfirmiereRepository infirmiereRepository){
        this.infirmiereRepository = infirmiereRepository;
    }

    @Override
    public List<Infirmiere> findAll() {
        return this.infirmiereRepository.findAll();
    }

    @Override
    public Optional<Infirmiere> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        this.infirmiereRepository.deleteById(id);
    }

    @Override
    public Infirmiere save(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public Infirmiere putInfirmiere(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }
}
