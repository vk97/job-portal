package com.company.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.jobportal.entity.Job;
import com.company.jobportal.service.JobServiceImplementation;

@RestController
@RequestMapping("/api")
public class JobController {
	
	@Autowired
	private JobServiceImplementation service;
	
	@PostMapping("/post-job")
	public Job postJob(@RequestBody Job job) {
		return service.postJob(job);
	}
	
	@GetMapping("/jobs")
	public List<Job> getAllJobs(){
		return service.getJobs();
	}
}
