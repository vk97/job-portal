package com.company.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.jobportal.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

}
