package com.example.demo.dtoconverter;

import com.example.demo.dto.MovieDTO;
import com.example.demo.model.Movie;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.List;

public class DTOMapper {
    private ModelMapper mapper;



  /* private MovieDTO convertEntityToDto(Movie movie){
       MovieDTO moviedto = new MovieDTO();
       moviedto.setName(movie.getName());
       moviedto.setDirector(movie.getDirector());
       moviedto.setDescription(movie.getDescription());
       moviedto.setYear(movie.getYear());
       moviedto.setCategoryname(movie.getCategory().getCategoryname());
        return moviedto;
  }
    private Movie convertDtoToEntity(MovieDTO moviedto){
       Movie movie = new Movie();
       movie.setName(moviedto.getName());
       movie.setDirector(moviedto.getDirector());
       movie.setDescription(moviedto.getDescription());
       movie.setYear(moviedto.getYear());
       movie.setCategory(Category.setCategoryname);
    }*/
  public MovieDTO convertEntityToDto(List<Movie> movie){
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
