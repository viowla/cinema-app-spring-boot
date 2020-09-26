package kz.iitu.userservice.repositories;

import kz.iitu.userservice.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
