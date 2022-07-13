package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    private String director;

    private String rating;

    private String description;


    public Movie() {
    }

    public Movie(Integer id, String name, String director, String rating, String description) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

