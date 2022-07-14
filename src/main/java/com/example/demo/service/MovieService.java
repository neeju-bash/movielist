package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.MovieDTO;
import com.example.demo.dtoconverter.DTOMapper;
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
    @Autowired
    private DTOMapper dtomapper;
    public List<MovieDTO> retrievemovies(){
        List<Movie> movies = (List<Movie>) movieRepository.findAll();
        return (List<MovieDTO>) dtomapper.convertEntityToDto(movies);
    }

    public Movie saveMovie(Movie movie){


       return movieRepository.save(movie);
    }

}