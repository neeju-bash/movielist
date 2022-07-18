package com.example.demo.service;
import java.util.List;

import com.example.demo.exception.GenericException;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class MovieService {

    private static final Logger log = LoggerFactory.getLogger(MovieService.class);

    @Autowired
    private MovieRepository movieRepository;

    //Retrieve all movies in the repository
    //return Movie
    public List<Movie> retrievemovies(){
        log.debug("inside retrievemovies() method");

        List<Movie> movies =  movieRepository.findAll();
    return movies;
    }

    //save movie in repository
    //return Movie
    //inside checking if movie already exists

    public Movie saveMovie(Movie movie) throws GenericException {

        log.debug("inside saveMovie() method");

       List<Movie> movielist = movieRepository.findAll();
        for(Movie i : movielist){
            if((i.getName().equals(movie.getName()))&&(i.getRelease_year().equals(movie.getRelease_year()))){
                log.debug("checking if movie already exists");
                throw new GenericException("Movie already exists");
            }
        }

       return movieRepository.save((movie));
    }

}

