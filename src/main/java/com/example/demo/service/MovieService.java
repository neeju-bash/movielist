package com.example.demo.service;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.dto.MovieDTO;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ModelMapper mapper;


    public List<MovieDTO> retrievemovies(){
        List<MovieDTO> movieDTOS = (List<MovieDTO>) movieRepository.findAll().stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    return movieDTOS;
    }

    public Movie saveMovie(MovieDTO movieDTO){

       return movieRepository.save(convertDtoToEntity(movieDTO));
    }
    private MovieDTO convertEntityToDto(Movie movie){
        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        MovieDTO moviedto = new MovieDTO();
        moviedto = mapper.map(movie, MovieDTO.class);
        return moviedto;
    }
    private Movie convertDtoToEntity(MovieDTO moviedto){
        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Movie movie  = new Movie();
        movie = mapper.map(moviedto, Movie.class);
        return movie;
    }
}

