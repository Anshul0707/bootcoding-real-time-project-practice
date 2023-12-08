package com.bootcoding.medappoint.dao;

import com.bootcoding.medappoint.model.Doctor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class DoctorDaoImpl implements DoctorDao {

    private final JdbcTemplate jdbcTemplate;

    public DoctorDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Doctor findById(Long id) {
        String sql = "SELECT * FROM doctor WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Doctor.class));
    }

    @Override
    public List<Doctor> findAll() {
        String sql = "SELECT * FROM doctor";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Doctor.class));
    }

    @Override
    public void save(Doctor doctor) {
        String sql = "INSERT INTO doctor (name) VALUES (?)";
        jdbcTemplate.update(sql, doctor.getName());
    }

    @Override
    public void update(Doctor doctor) {
        String sql = "UPDATE doctor SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, doctor.getName(), doctor.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM doctor WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}

