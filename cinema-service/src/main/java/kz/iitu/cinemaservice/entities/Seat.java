package kz.iitu.cinemaservice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "cinema_seat")
@Getter
@Setter
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;


    private Room room;
    private int rowNumber;
    private int columnNumber;

    public Seat() {
    }

    public Seat(Room room, int rowNumber, int columnNumber) {
        this.room = room;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }

    @ManyToOne
    @JoinColumn(name = "room_id")
    public Room getRoom(){
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
