package com.nitish.service;

import java.util.Optional;

import com.nitish.model.School;

public interface SchoolStudentService {
	public Iterable<School> getDetails();
    public School createSchool(School school);
    public Optional<School> findBySchoolId(Integer schoolId);

}
