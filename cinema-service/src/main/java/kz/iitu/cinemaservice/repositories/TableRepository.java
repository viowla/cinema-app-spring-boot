package kz.iitu.cinemaservice.repositories;

import kz.iitu.cinemaservice.entities.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Table, Long> {
}
