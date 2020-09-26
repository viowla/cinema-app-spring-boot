package kz.iitu.movieservice.controllers;

import io.swagger.annotations.Api;
import kz.iitu.movieservice.entities.Genre;
import kz.iitu.movieservice.entities.Movie;
import kz.iitu.movieservice.repositories.GenreRepository;
import kz.iitu.movieservice.repositories.MovieRepository;
import kz.iitu.movieservice.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/movies")
@Api(value = "Movie Controller class")
public class MovieController {

    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/genre/{genre}")
    public List<Movie> getAllMoviesByGenre(@PathVariable Genre genre) {
        return movieRepository.findMovieByGenres(genre);
    }

    @GetMapping("/{title}")
    public Movie getMovieByTitle(@PathVariable String title){
        return movieRepository.findMovieByMovieTitle(title);
    }

    @PostMapping("")
    public void createMovie(Movie movie){
        movieService.createMovie(movie);
    }

    @PutMapping("/update/{id}")
    public void updateMovie(@PathVariable Long id,
                            @RequestBody Movie movie){
        movieService.updateMovie(id, movie);
    }

}
