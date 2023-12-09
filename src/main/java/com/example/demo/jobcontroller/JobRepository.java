
package com.example.demo.jobcontroller;
import com.example.demo.model.Job;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {
    @Query("SELECT j FROM Job j WHERE j.id = ?1")
    Optional<Job> findJobById(Long id);
}
