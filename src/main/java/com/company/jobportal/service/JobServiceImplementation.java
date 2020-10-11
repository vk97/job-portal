 package com.company.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.jobportal.entity.Job;
import com.company.jobportal.repository.JobRepository;

@Service
public class JobServiceImplementation implements JobService{
	@Autowired
	private JobRepository repository;
	
	@Override
	public Job postJob(Job job) {
		return repository.save(job);
	}
	@Override
	public List<Job> getJobs(){
		return repository.findAll();
	}
}
