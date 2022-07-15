package com.example.demo.controller;

import com.example.demo.dto.MovieDTO;
import com.example.demo.dtoconvertor.InformationMapper;
import com.example.demo.exception.GenericException;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;



@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private  InformationMapper mapper;

   @GetMapping("/api/movies")
    public List<MovieDTO> getMovies() {
       List<Movie> moviesdtos = movieService.retrievemovies();

       return mapper.convertEntityToDto(moviesdtos);
   }

    @PostMapping("/api/movies")
    public MovieDTO saveMovie(@RequestBody @Valid  MovieDTO movieDTO) throws GenericException {

        Movie movie=mapper.convertDtoToEntity(movieDTO);
        movieService.saveMovie(movie);
        return mapper.convertEntityToDto(movie);
    }

}
