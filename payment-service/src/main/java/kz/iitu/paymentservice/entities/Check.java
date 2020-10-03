package kz.iitu.paymentservice.entities;

import kz.iitu.cinemaservice.entities.Reservation;
import kz.iitu.userservice.entities.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class Check {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checkId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @Column(name = "cost")
    private double cost;


}
