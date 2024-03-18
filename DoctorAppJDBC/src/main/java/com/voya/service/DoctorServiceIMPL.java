package com.voya.service;

import com.voya.model.Doctor;
import com.voya.repository.IDoctorRepository;
import com.voya.repository.IDoctorService;

public class DoctorServiceIMPL implements IDoctorService {
	private IDoctorRepository doctorRepository = new DoctorRepositoryIMPL();
	public void addDoctor(Doctor doctor) {
		
	}
	@Override
	public void addDoctor1(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
	}

}
