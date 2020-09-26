package kz.iitu.cinemaservice.entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "cinema_seat")
public class Seat {

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

    @Column(name = "seat_row_number")
    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    @Column(name = "seat_column_number")
    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }
}
