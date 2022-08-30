package com.example.demoheroku;

import com.example.demoheroku.entity.Movie;
import com.example.demoheroku.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoHerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHerokuApplication.class, args);
    }

    @Autowired
    private MovieService movieService;


}
