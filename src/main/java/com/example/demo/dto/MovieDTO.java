package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MovieDTO {
    private String name;
    private String director;
    private String rating;
    private String description;
    private Long release_year;
    private String categoryname;
}
