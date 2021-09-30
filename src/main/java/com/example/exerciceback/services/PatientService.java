package com.example.exerciceback.services;

import com.example.exerciceback.models.Infirmiere;
import com.example.exerciceback.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    public List<Patient> findAll();
    public Optional<Patient> findById(Long aLong);

    public void deleteById(Long aLong);
    public Patient save(Patient entity);
    public Patient putPatient(Patient patient);

}
