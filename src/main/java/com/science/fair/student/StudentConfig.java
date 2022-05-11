package com.science.fair.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            LocalDate birthday= LocalDate.of(1989, Month.MAY,10);

                   Student victoria = new Student(
                            "Victoria",
                            "happy@godaddy.com",
                           birthday
                    );
                   Student david= new Student(

                            "David Jay",
                            "javaCoding@dojo.com",
                            LocalDate.of(1981,01,03)

                    );
                    repository.saveAll(List.of(victoria,david));


        };
    }
}
