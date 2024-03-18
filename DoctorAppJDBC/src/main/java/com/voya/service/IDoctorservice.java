package com.voya.service;
import com.voya.exception.*;
import com.voya.model.Doctor;

public interface IDoctorservice {
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId);
	void deleteDoctor(int doctorId);
}