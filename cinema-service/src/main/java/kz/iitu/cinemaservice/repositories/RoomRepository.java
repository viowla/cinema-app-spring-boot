package kz.iitu.cinemaservice.repositories;

import kz.iitu.cinemaservice.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
