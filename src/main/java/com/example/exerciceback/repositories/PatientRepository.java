package com.example.exerciceback.repositories;

import com.example.exerciceback.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
