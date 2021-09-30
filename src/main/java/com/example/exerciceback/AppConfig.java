package com.example.exerciceback;

import com.example.exerciceback.repositories.InfirmiereRepository;
import com.example.exerciceback.repositories.PatientRepository;
import com.example.exerciceback.services.InfirmiereService;
import com.example.exerciceback.services.InfirmiereServiceImpl;
import com.example.exerciceback.services.PatientService;
import com.example.exerciceback.services.PatientServiceImpl;
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
}
