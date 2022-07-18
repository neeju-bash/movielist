package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Entity class of Movie
//associated table movies
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String director;

    private String rating;
    private Long release_year;

    private String description;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;


}

