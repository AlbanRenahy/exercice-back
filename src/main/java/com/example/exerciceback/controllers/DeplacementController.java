package com.example.exerciceback.controllers;

import com.example.exerciceback.models.Adresse;
import com.example.exerciceback.models.Deplacement;
import com.example.exerciceback.models.Infirmiere;
import com.example.exerciceback.models.Patient;
import com.example.exerciceback.services.AdresseService;
import com.example.exerciceback.services.DeplacementService;
import com.example.exerciceback.services.InfirmiereService;
import com.example.exerciceback.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("deplacements")
public class DeplacementController {
    private DeplacementService deplacementService;
    public DeplacementController(DeplacementService deplacementService){ this.deplacementService = deplacementService;}

    @GetMapping("")
    public List<Deplacement> findAll(){
        return this.deplacementService.findAll();
    }

    @PostMapping("")
    public Deplacement save(@RequestBody Deplacement deplacement) {
        return this.deplacementService.save(deplacement);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.deplacementService.deleteById(id);
    }

    @PutMapping("")
    public Deplacement putLieu(@RequestBody Deplacement deplacement){
        return this.deplacementService.putDeplacement(deplacement);
    }
}
