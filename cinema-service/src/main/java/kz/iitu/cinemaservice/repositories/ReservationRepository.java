package kz.iitu.cinemaservice.repositories;

import kz.iitu.cinemaservice.entities.Reservation;
import kz.iitu.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository  extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByUser(User user);
}
