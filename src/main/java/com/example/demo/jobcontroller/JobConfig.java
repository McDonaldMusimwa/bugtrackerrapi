
package com.example.demo.jobcontroller;

import com.example.demo.usercontroller.UserRepository;
import com.example.demo.model.Job;
import com.example.demo.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Optional;

@Configuration
public class JobConfig {
@Bean
    CommandLineRunner JobcommandLineRunner(JobRepository repository, UserRepository userRepository){
    return args ->{
        Optional<User> optionalUser = userRepository.findById(1L);
        User existingUser = optionalUser.orElse(null);

        if (existingUser == null) {
            // If the user doesn't exist, create a new user
            existingUser = new User("McDonald", "Musimwa", LocalDate.of(1992, 9, 27), User.ClearanceLevel.LEVEL_1, "mcdonald.musimwa74@gmail.com","McDonald");
            userRepository.save(existingUser);
        }

        Job buginlogin = new Job(2L,"Bug on Authentication", LocalDate.of(2023, 12, 5), "The client is not receiving jwt", 0.0,"None",existingUser);

        repository.save(buginlogin);


    };
}

}
