package com.example.exerciceback.repositories;

import com.example.exerciceback.models.Adresse;
import com.example.exerciceback.models.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeplacementRepository extends JpaRepository<Deplacement, Long> {
}
