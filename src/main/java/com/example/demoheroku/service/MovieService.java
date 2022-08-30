package com.example.demoheroku.service;

import com.example.demoheroku.entity.Movie;
import com.example.demoheroku.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll(){return movieRepository.findAll();}

    public Movie insert(Movie movie){
        return movieRepository.save(movie);
    }
    public void deleteById(Long id){
        movieRepository.deleteById(id);
    }
}
