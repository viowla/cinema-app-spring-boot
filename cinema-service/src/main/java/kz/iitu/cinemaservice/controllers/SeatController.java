package kz.iitu.cinemaservice.controllers;

import kz.iitu.cinemaservice.entities.Seat;
import kz.iitu.cinemaservice.repositories.RoomRepository;
import kz.iitu.cinemaservice.repositories.SeatRepository;
import kz.iitu.cinemaservice.services.RoomService;
import kz.iitu.cinemaservice.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private SeatService seatService;

    @GetMapping("")
    public List<Seat> getAllSeats(){
       return seatRepository.findAll();
    }

    @PostMapping("")
    public void createSeat(){
        seatService.create();
    }

    @DeleteMapping("/{id}")
    public void deleteSeat(@PathVariable Long id){
         seatRepository.deleteById(id);
    }


}
