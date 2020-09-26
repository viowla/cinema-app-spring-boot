package kz.iitu.cinemaservice.repositories;

import kz.iitu.cinemaservice.entities.Room;
import kz.iitu.cinemaservice.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {

    List<Seat> findAllByRoom(Room room);
}
