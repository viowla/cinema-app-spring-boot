package kz.iitu.movieservice.services;


import kz.iitu.movieservice.entities.Movie;

public interface MovieService {

    void createMovie(Movie movie);
    void updateMovie(Long id, Movie movie);

}
