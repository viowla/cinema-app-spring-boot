package kz.iitu.movieservice.repositories;

import kz.iitu.movieservice.entities.Genre;
import kz.iitu.movieservice.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findMovieByMovieTitle(String title);
    List<Movie> findMovieByGenres(Genre genre);
}
