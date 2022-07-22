package com.example.demo.controller;

import com.example.demo.dto.MovieDTO;
import com.example.demo.dtoconvertor.InformationMapper;
import com.example.demo.exception.GenericException;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


//Rest Controller for the application
//map all the incoming http requests
@RestController
public class MovieController {

     Logger log = LoggerFactory.getLogger(MovieService.class);

    @Autowired
    private MovieService movieService;

   @GetMapping("/api/movies")
    public List<MovieDTO> getMovies() {
       log.debug("inside MovieController.getMovies() method");
       List<MovieDTO> movieDTOS = movieService.retrievemovies();
       log.error("MovieController.getMovies() method");

       return movieDTOS;
   }

    @PostMapping("/api/movies")
    public MovieDTO saveMovie(@RequestBody @Valid  MovieDTO movieDTO) throws GenericException {

        log.debug("inside MovieController.saveMovie() method");

        movieService.saveMovie(movieDTO);
        return movieDTO;
    }

}
