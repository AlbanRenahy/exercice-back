package com.example.exerciceback.controllers;

import com.example.exerciceback.models.Adresse;
import com.example.exerciceback.models.Infirmiere;
import com.example.exerciceback.models.Patient;
import com.example.exerciceback.services.AdresseService;
import com.example.exerciceback.services.InfirmiereService;
import com.example.exerciceback.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("adresses")
public class AdresseController {
    private AdresseService adresseService;
    public AdresseController(AdresseService adresseService){ this.adresseService = adresseService;}

    @GetMapping("")
    public List<Adresse> findAll(){
        return this.adresseService.findAll();
    }

    @PostMapping("")
    public Adresse save(@RequestBody Adresse adresse) {
        return this.adresseService.save(adresse);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.adresseService.deleteById(id);
    }

    @PutMapping("")
    public Adresse putLieu(@RequestBody Adresse adresse){
        return this.adresseService.putAdresse(adresse);
    }
}
