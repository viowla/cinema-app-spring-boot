package kz.iitu.movieservice.repositories;

import kz.iitu.movieservice.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    Genre findByGenreName(String name);
}
