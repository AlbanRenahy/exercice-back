package com.example.exerciceback.services;

import com.example.exerciceback.models.Infirmiere;
import com.example.exerciceback.models.Patient;
import com.example.exerciceback.repositories.InfirmiereRepository;
import com.example.exerciceback.repositories.PatientRepository;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PatientService
{
    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }

    @Override
    public Optional<Patient> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        this.patientRepository.deleteById(id);
    }

    @Override
    public Patient save(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient putPatient(Patient patient) {
        return this.patientRepository.save(patient);
    }
}
