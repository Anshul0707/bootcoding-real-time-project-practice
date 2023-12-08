package com.bootcoding.medappoint.service;

import com.bootcoding.medappoint.dao.DoctorDao;
import com.bootcoding.medappoint.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorDao doctorDao;

    public Doctor getDoctorById(Long id) {
        return doctorDao.findById(id);
    }

    public List<Doctor> getAllDoctors() {
        return doctorDao.findAll();
    }

    public void saveDoctor(Doctor doctor) {
        doctorDao.save(doctor);
    }

    public void updateDoctor(Doctor doctor) {
        doctorDao.update(doctor);
    }

    public void deleteDoctor(Long id) {
        doctorDao.delete(id);
    }
}

