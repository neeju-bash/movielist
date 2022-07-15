package com.example.demo.dtoconvertor;
import com.example.demo.dto.MovieDTO;
import com.example.demo.model.Movie;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class  InformationMapper{



    public MovieDTO convertEntityToDto(Movie movie){
        ModelMapper mapper =new ModelMapper();
        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        MovieDTO map = mapper.map(movie, MovieDTO.class);
        return map;
    }


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
