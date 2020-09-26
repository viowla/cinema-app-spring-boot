package kz.iitu.movieservice.repositories;

import kz.iitu.movieservice.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findMovieByMovieTitle(String title);
}
