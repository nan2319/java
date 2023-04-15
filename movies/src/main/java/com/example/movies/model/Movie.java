package com.example.movies.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Movie {
    private String movieId;
    private String title;
    private String genre;
    private String director;
    private String duration;
    private String actors;

    public Movie(String title, String genre, String director, String duration, String actors) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.duration = duration;
        this.actors = actors;
    }

    
}
