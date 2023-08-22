package com.patient.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.patient.microservice.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{

}