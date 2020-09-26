package kz.iitu.cinemaservice.controllers;

import io.swagger.annotations.Api;
import kz.iitu.cinemaservice.entities.News;
import kz.iitu.cinemaservice.exceptions.NewsNotFoundException;
import kz.iitu.cinemaservice.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/news")
@Api(value = "News Controller class")
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("")
    private List<News> findAllNews(){
        return newsRepository.findAll();
    }

    @GetMapping("/{id}")
    private News findNewsById(@PathVariable Long id) throws NewsNotFoundException {
        News news = newsRepository.findById(id).orElse(null);
        if (news == null) {
            throw new NewsNotFoundException();
        }
        return news;
    }

    @DeleteMapping("/{id}")
    public void deleteNews(@PathVariable Long id) {
        newsRepository.deleteById(id);
    }



}
