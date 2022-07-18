package com.example.demo.dtoconvertor;
import com.example.demo.controller.dto.MovieDTO;
import com.example.demo.model.Movie;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class  InformationMapper{

    //convert Entity object of Movie to Movie DTO
    //uses model mapper to convert
    //return movieDTO object
    public MovieDTO convertEntityToDto(Movie movie){
        ModelMapper mapper =new ModelMapper();
        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        MovieDTO map = mapper.map(movie, MovieDTO.class);
        return map;
    }

    //convert DTO of Movie to Movie Entity object
    //uses model mapper to convert
    //return movie object

    public Movie convertDtoToEntity(MovieDTO moviedto){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Movie map = mapper.map(moviedto, Movie.class);
        return map;
    }
    public  List<MovieDTO> convertEntityToDto(List<Movie> movies) {

        return	movies.stream().map(x -> convertEntityToDto(x)).collect(Collectors.toList());
    }
    public List<Movie> convertDtoToEntity(List<MovieDTO> moviedtos)
    {

        return moviedtos.stream().map(x -> convertDtoToEntity(x)).collect(Collectors.toList());
    }
}
