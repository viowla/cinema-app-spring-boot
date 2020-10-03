package kz.iitu.cinemaservice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@javax.persistence.Table(name = "table")
@Getter
@Setter
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;

    private Date startDate;
    private Date endDate;

    public Table() {
    }

    public Table(Date startDate, Date endDate){
        this.endDate=endDate;
        this.startDate=startDate;
    }

}
