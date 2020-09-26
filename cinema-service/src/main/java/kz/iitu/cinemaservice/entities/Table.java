package kz.iitu.cinemaservice.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@javax.persistence.Table(name = "table")
public class Table {

    private Date startDate;
    private Date endDate;

    public Table() {
    }

    public Table(Date startDate, Date endDate){
        this.endDate=endDate;
        this.startDate=startDate;
    }

    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "end_date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
