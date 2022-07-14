package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> retrievemovies(){
        List<Movie> movies = (List<Movie>) movieRepository.findAll();
        return movies;
    }

    public Movie saveMovie(Movie movie){
       return movieRepository.save(movie);
    }

}