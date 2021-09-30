package com.example.exerciceback.services;

import com.example.exerciceback.models.Deplacement;
import com.example.exerciceback.repositories.DeplacementRepository;

import java.util.List;
import java.util.Optional;

public class DeplacementServiceImpl implements DeplacementService
{
    private DeplacementRepository deplacementRepository;

    public DeplacementServiceImpl(DeplacementRepository deplacementRepository){
        this.deplacementRepository = deplacementRepository;
    }

    @Override
    public List<Deplacement> findAll() {
        return this.deplacementRepository.findAll();
    }

    @Override
    public Optional<Deplacement> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        this.deplacementRepository.deleteById(id);
    }

    @Override
    public Deplacement save(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }

    @Override
    public Deplacement putDeplacement(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }
}
