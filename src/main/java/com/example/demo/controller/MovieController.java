package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping("/api/movies")
    public List<Movie> getMovies() {
        List<Movie> movies = movieService.retrievemovies();
        return movies;
    }

    @PostMapping("/api/movies")
    public String saveMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
        return "Movie Saved Successfully";
    }

}
