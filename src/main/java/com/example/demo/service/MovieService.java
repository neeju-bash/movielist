package com.example.demo.service;


import com.example.demo.model.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> retrievemovies();

    public Movie getMovie(long id);

    public void saveMovie(Movie movie);

    public void deleteMovie(long id);

    public void updateMovie(Movie movie);
}