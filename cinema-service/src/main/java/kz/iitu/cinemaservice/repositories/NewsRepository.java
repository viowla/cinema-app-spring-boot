package kz.iitu.cinemaservice.repositories;

import kz.iitu.cinemaservice.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {

}
