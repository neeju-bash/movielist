package com.example.demo.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    @Column(name="NAME")
    private String name;
    @Column(name="DIRECTOR")
    private String director;
    @Column(name="RATING")
    private String rating;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="DEPARTMENT")
    private List<Catagory> catagory;


    public Movie() {
    }

    public Movie(String id, String name, String director, String rating, String description, List<Catagory> category) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.description = description;
        this.catagory = catagory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public List<Catagory> getCatagory() {
        return catagory;
    }

    public void setCatagory(List<Catagory> catagory) {
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                ", category=" + catagory +
                '}';
    }
}

