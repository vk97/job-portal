package com.company.jobportal.service;

import java.util.List;

import com.company.jobportal.entity.Job;

public interface JobService {
	public Job postJob(Job job);
	public List<Job> getJobs();
}
