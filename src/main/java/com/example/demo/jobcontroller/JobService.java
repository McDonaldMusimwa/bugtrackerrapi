
package com.example.demo.jobcontroller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Job;
@Service
public class JobService {
    private final JobRepository jobRepository;
    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }





    public List<Job> getJob() {



        return jobRepository.findAll();
    }

    public void addNewJob(Job job) {
        Optional<Job> jobById = jobRepository.findJobById(job.getId());

        if(jobById.isPresent()){
            throw new IllegalStateException("job already exists");
        };
        jobRepository.save(job);

    }
}

/*
        User assignedPersonnel = new User(1L,"McDonald", "McDonald", LocalDate.of(1992, 9, 27), User.ClearanceLevel.LEVEL_1, "mcdonad@gmail.com");


        Job job = new Job(1L, "Bug on Authentication", LocalDate.of(2023, 12, 5), "The client is not receiving jwt", 0.0,assignedPersonnel);
        job.setAssignedpersonel(assignedPersonnel);s

*/
