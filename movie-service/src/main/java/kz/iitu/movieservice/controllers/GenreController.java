package kz.iitu.movieservice.controllers;

import io.swagger.annotations.Api;
import kz.iitu.movieservice.entities.Genre;
import kz.iitu.movieservice.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
@Api(value = "Genre Controller class")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;


    @GetMapping("")
    public List<Genre> getAllRoles(){
        return genreRepository.findAll();
    }

    @PostMapping("/add")
    public Genre addRole(@RequestBody Genre genre){
        return genreRepository.saveAndFlush(genre);
    }


    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id){
        genreRepository.deleteById(id);
    }
}
