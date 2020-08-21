package com.nitish.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nitish.model.School;

@Repository
public interface SchoolDao extends JpaRepository<School,Integer> {

}