package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String director;

    private String rating;
    private String year;

    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryid")
    private Category category;



    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", year=" + year +
                '}';
    }
}

