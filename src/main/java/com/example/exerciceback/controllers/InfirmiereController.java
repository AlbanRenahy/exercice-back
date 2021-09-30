package com.example.exerciceback.controllers;

import com.example.exerciceback.models.Infirmiere;
import com.example.exerciceback.services.InfirmiereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("infirmieres")
public class InfirmiereController {
    private InfirmiereService infirmiereService;

    public InfirmiereController(InfirmiereService infirmiereService){ this.infirmiereService = infirmiereService;}

    @GetMapping("")
    public List<Infirmiere> findAll(){
        return this.infirmiereService.findAll();
    }

    @PostMapping("")
    public Infirmiere save(@RequestBody Infirmiere infirmiere) {
        return this.infirmiereService.save(infirmiere);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.infirmiereService.deleteById(id);
    }

    @PutMapping("")
    public Infirmiere putLieu(@RequestBody Infirmiere infirmiere){
        return this.infirmiereService.putInfirmiere(infirmiere);
    }
}
