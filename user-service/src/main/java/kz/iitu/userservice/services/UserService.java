package kz.iitu.userservice.services;


import kz.iitu.userservice.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void createUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}
