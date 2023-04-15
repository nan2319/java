package com.example.movies.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.movies.model.Movie;
import com.example.movies.service.MovieService;

@Component
public class MovieFiller {
    private final MovieService movieService;
    
    public MovieFiller(MovieService movieService){
        this.movieService=movieService;
    }

    @PostConstruct
    public void init(){
        Movie movie1 = new Movie("NOPE", "terror", "Jordan Peele", "130m", "Daniel Kaluuya, Steven Yeun, Keke Palmer");
        movieService.addMovie(movie1);

        try{Thread.sleep(10,0);} catch (InterruptedException e){}
        Movie movie2 = new Movie("Super Mario Bros", "animacion", "Aaron Horvath", "92m", "Chris Pratt, Anya Taylor-Joy");
        movieService.addMovie(movie2);

        try{Thread.sleep(10,0);} catch (InterruptedException e){}
        Movie movie3= new Movie("Evereything everywhere all at once", "drama/ciencia ficcion", "Daniel Kwan, Daniel Scheinert", "139m", "Michelle Yeoh, Ke Huy Quan, Jamie Lee Curtis");
        movieService.addMovie(movie3);

        try{Thread.sleep(10,0);} catch (InterruptedException e){}
        Movie movie4 = new Movie("The Whale", "drama", "Darren Aronofsky", "117m", "Brendan Fraser, Sadie Sink");
        movieService.addMovie(movie4);
    }
}
