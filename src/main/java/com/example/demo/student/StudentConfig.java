package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {
                 Student karim =new Student("Towhid","towhid@gmail.com",
                            LocalDate.of(2001, FEBRUARY,4));
            Student rahim =new Student("Miraz","miraz@gmail.com",
                    LocalDate.of(2002, FEBRUARY,4));
            repository.saveAll(
                    List.of(karim,rahim)
            );
        };
    }
}
