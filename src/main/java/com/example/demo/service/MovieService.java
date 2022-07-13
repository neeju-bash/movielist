package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> retrievemovies(){
        List<Movie> movies = (List<Movie>) movieRepository.findAll();
        return movies;
    }

    public Movie getMovie(int id){
        Optional<Movie> optEmp = movieRepository.findById(id);
        return optEmp.get();
    }

    public void saveMovie(Movie movie){
        movieRepository.save(movie);
    }

    public void deleteMovie(int id){
        movieRepository.deleteById(id);
    }

    public void updateMovie(Movie movie){
        movieRepository.save(movie);
    }
}