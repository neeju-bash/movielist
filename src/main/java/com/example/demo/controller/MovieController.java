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

    @GetMapping("/api/movies/{id}")
    public Movie getMovie(@PathVariable(name="id")int id) {
        return movieService.getMovie(id);
    }

    @PostMapping("/api/movies")
    public void saveMovie(Movie movie){
        movieService.saveMovie(movie);
        System.out.println("Movie Saved Successfully");
    }

    @DeleteMapping("/api/movies/{id}")
    public void deleteMovie(@PathVariable(name="id")int id){
        movieService.deleteMovie(id);
        System.out.println("Movie Deleted Successfully");
    }

    @PutMapping("/api/movies/{id}")
    public void updateMovie(@RequestBody Movie movie,
                               @PathVariable(name="id")int id){
        Movie mov = movieService.getMovie(id);
        if(mov != null){
            movieService.updateMovie(movie);
        }

    }

}
