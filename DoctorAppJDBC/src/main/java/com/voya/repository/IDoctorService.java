package com.voya.repository;
import com.voya.exception.*;
import com.voya.model.Doctor;
import com.voya.repository.*;
public interface IDoctorService {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId, double fes);
    void deleteDoctor(int doctorId);
	void addDoctor1(Doctor doctor);
}
