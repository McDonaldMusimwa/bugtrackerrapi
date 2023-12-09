
package com.example.demo.jobcontroller;

import com.example.demo.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/job")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<Job> getJob() {
        return jobService.getJob();
    }


    @PostMapping
    public void createNewJob(@RequestBody Job job) {
        jobService.addNewJob(job);
    }
}
