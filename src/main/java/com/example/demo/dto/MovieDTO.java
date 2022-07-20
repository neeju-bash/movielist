package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


//DTO class of Movie
//For data transfer to client
@Data
public class MovieDTO {
    @NotBlank(message = "Movie name sould not be null")
    private String name;
    @NotBlank(message = "Movie director name must not be null")
    private String director;
    @Min(0)
    @Max(10)
    private String rating;
    private String description;
    @Min(1900)
    @Max(2022)
    private Long release_year;
    private String categoryname;
}
