package com.voya.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.voya.model.Doctor;
import com.voya.util.DoctorDb;
import com.voya.util.Queries;

public abstract class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void  addDoctor(Doctor doctor)  {

        try(Connection connection = DoctorDb.OpenConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ){
            statement.setString(1,doctor.getDoctorName());
            statement.setString(2,doctor.getSpeciality());
            statement.setInt(3,doctor.getExperience());
            statement.setInt(4,doctor.getRatings());
            statement.setDouble(5,doctor.getFees());
            //call execute
            boolean result = statement.execute();
            System.out.println("one row inserted "+!result);
        }catch (Exception e ){
            e.printStackTrace();
        }

    }
}

	