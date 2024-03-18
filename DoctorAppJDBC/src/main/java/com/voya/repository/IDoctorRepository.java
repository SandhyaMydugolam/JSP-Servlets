package com.voya.repository;
import com.voya.exception.*;
import com.voya.model.Doctor;

public interface IDoctorRepository {
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId);
	void deleteDoctor(int doctorId);
}


	