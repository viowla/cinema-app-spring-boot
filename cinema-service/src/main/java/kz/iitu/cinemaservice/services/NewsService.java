package kz.iitu.cinemaservice.services;

import kz.iitu.cinemaservice.entities.News;

public interface NewsService {

    Long count();
    void updateNews(Long id, News news);
}
