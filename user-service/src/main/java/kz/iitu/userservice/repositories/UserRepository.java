package kz.iitu.userservice.repositories;

import kz.iitu.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
    List<User> findAllByUserRoleContains(String role);
}
