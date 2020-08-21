package com.nitish.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.nitish.model.School;
import com.nitish.repo.SchoolDao;

@Service
public class SchoolStudentServiceImpl  implements SchoolStudentService{
    private SchoolDao schoolDao;

    public SchoolStudentServiceImpl(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    @Transactional
    public Iterable<School> getDetails() {
        return schoolDao.findAll();
    }

    @Override
    @Transactional
    public School createSchool(School school) {
        return schoolDao.save(school);
    }

    @Override
    @Transactional
    public Optional<School> findBySchoolId(Integer schoolId) {
        return schoolDao.findById(schoolId);
    }
	
}