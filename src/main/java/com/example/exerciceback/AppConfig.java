package com.example.exerciceback;

import com.example.exerciceback.repositories.AdresseRepository;
import com.example.exerciceback.repositories.DeplacementRepository;
import com.example.exerciceback.repositories.InfirmiereRepository;
import com.example.exerciceback.repositories.PatientRepository;
import com.example.exerciceback.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InfirmiereService infirmiereService(InfirmiereRepository infirmiereRepository){
        return new InfirmiereServiceImpl(infirmiereRepository);}

    @Bean
    public PatientService patientService(PatientRepository patientRepository){
        return new PatientServiceImpl(patientRepository);}

    @Bean
    public AdresseService adresseService(AdresseRepository adresseRepository){
        return new AdresseServiceImpl(adresseRepository);}

    @Bean
    public DeplacementService deplacementService(DeplacementRepository deplacementRepository){
        return new DeplacementServiceImpl(deplacementRepository);}
}
