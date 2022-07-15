package com.example.demo.service;
import java.util.List;

import com.example.demo.exception.GenericException;
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

        List<Movie> movies =  movieRepository.findAll();
    return movies;
    }

    public Movie saveMovie(Movie movie) throws GenericException {

       List<Movie> movielist = movieRepository.findAll();
        for(Movie i : movielist){
            if((i.getName().equals(movie.getName()))&&(i.getRelease_year().equals(movie.getRelease_year()))){

                throw new GenericException("Movie already exists");
            }
        }

       return movieRepository.save((movie));
    }

}

