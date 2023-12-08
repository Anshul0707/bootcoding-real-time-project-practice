package com.bootcoding.medappoint.dao;

import com.bootcoding.medappoint.model.Doctor;

import java.util.List;

public interface DoctorDao {
    Doctor findById(Long id);

    List<Doctor> findAll();

    void save(Doctor doctor);

    void update(Doctor doctor);

    void delete(Long id);
}
