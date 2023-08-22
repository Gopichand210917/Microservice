package com.patient.microservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.patient.microservice.entity.Patient;
import com.patient.microservice.service.PatientService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class PatientController {
	
	@Autowired
	PatientService service;
	
	@PostMapping("/addPatient")
	public Patient addPatient(@RequestBody Patient patient) {
		return service.savePatient(patient);
	}
	
	@PostMapping("/addPatients")
	public List<Patient> addPatients(@RequestBody List<Patient> patient)
	{
		return service.savePatients(patient);
	}
	
	@GetMapping("/getPatientList")
	public List<Patient> getAllPatients(){
		return service.getAllPatients();
	}
	
	@GetMapping("/getPatientById/{id}")
	public Patient findPatientById(@PathVariable int id) {
		return service.getPatientById(id);
	}
	
	@PutMapping("/update")
	public Patient updatePatient(@RequestBody Patient patient) {
		return service.updatePatient(patient);
	}
	
	@DeleteMapping("/deletepatientbyid{id}")
	public String deletePatient(@PathVariable int id) {
		return service.deletePatient(id);
	}
}
