package kz.iitu.movieservice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    private String movieTitle;
    private Date releaseDate;
    private String movieOverview;

    @ManyToMany
    @JoinTable(name = "movie_genre", joinColumns = @JoinColumn(name = "movie_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres = new ArrayList<>();

    public Movie() {
    }

    public Movie(String title, Date releaseDate, String overview, List<Genre> genres) {
        this.movieTitle = title;
        this.releaseDate = releaseDate;
        this.movieOverview = overview;
        this.genres=genres;
    }
}
