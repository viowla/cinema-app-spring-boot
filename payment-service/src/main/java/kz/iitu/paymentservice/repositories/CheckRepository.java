package kz.iitu.paymentservice.repositories;

import kz.iitu.paymentservice.entities.Check;
import kz.iitu.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CheckRepository extends JpaRepository<Check, Long> {
    List<Check> findCheckByUsers(User user);
}
