package com.example.demoheroku.controller;

import com.example.demoheroku.entity.Movie;
import com.example.demoheroku.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public String loadHomePage(Model model){
        List<Movie> movies = movieService.findAll();
        model.addAttribute("listMovie",movies);
        return "home";
    }

    @GetMapping("addMovie")
    public String loadPageInsertMovie(Model model){
        model.addAttribute("movie",new Movie());
        return "add_movie";
    }
    @PostMapping("addMovie")
    public String addMovie(@ModelAttribute Movie movie){
        return Optional.ofNullable(movieService.insert(movie)).map(movie1 -> "success").orElse("error");
    }
}
