package com.example.demo.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return  args -> {
            ;
            User mujeeb = new User(
                    "Mujeeb",
                    "muje@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            User adeshina = new User(
                    "Adeshina",
                    "adeshina@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(mujeeb, adeshina)
            );

        };
    }
}
