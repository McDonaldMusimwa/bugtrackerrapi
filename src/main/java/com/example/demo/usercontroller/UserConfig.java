package com.example.demo.usercontroller;


import com.example.demo.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner UsercommandLineRunner(UserRepository repository) {
        return args -> {
            User munashe = new User("Munashe",
                    "Musimwa",
                    LocalDate.of(2019, 10, 6),
                    User.ClearanceLevel.LEVEL_2,
                    "munashe@gmail.com",
                    "Munashe"
                    );

            User nokubonga = new User("Noku",
                    "Musimwa",
                    LocalDate.of(1993, 6, 14),
                    User.ClearanceLevel.LEVEL_1,
                    "noku@gmail.com",
                    "Nokubonga");

            repository.saveAll(List.of(munashe, nokubonga));

        };
    }

}
