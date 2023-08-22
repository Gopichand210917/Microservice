package com.patient.microservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.patient.microservice.entity.Patient;
import com.patient.microservice.repository.PatientRepository;

@Service
@Component
public class PatientService {
	
	@Autowired
	PatientRepository patientrepository;

	public Patient savePatient(Patient patient) {
		return patientrepository.save(patient);
	}

	public List<Patient> savePatients(List<Patient> patient) {
		return patientrepository.saveAll(patient);
	}

	public List<Patient> getAllPatients() {
		return patientrepository.findAll();
	}

	public Patient getPatientById(int id) {
		return patientrepository.findById(id).orElse(null);
	}

	public Patient updatePatient(Patient patient) {
		return patientrepository.save(patient);
	}

	public String deletePatient(int id) {
		
		patientrepository.deleteById(id);
		return  "Patient is Removed From List"+id ;
	}

}
