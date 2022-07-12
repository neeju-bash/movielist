package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> retrievemovies(){
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public Movie getMovie(long id) {
        Optional<Movie> optEmp = movieRepository.findById(id);
        return optEmp.get();
    }

    public void saveMovie(Movie movie){
        movieRepository.save(movie);
    }

    public void deleteMovie(long id){
        movieRepository.deleteById(id);
    }

    public void updateMovie(Movie movie){
        movieRepository.save(movie);
    }
}