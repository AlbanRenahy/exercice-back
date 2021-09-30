package com.example.exerciceback.controllers;

import com.example.exerciceback.models.Infirmiere;
import com.example.exerciceback.models.Patient;
import com.example.exerciceback.services.InfirmiereService;
import com.example.exerciceback.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService){ this.patientService = patientService;}

    @GetMapping("")
    public List<Patient> findAll(){
        return this.patientService.findAll();
    }

    @PostMapping("")
    public Patient save(@RequestBody Patient patient) {
        return this.patientService.save(patient);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.patientService.deleteById(id);
    }

    @PutMapping("")
    public Patient putLieu(@RequestBody Patient patient){
        return this.patientService.putPatient(patient);
    }
}
