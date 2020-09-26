package kz.iitu.paymentservice.controllers;

import kz.iitu.paymentservice.entities.Check;
import kz.iitu.paymentservice.repositories.CheckRepository;
import kz.iitu.userservice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payment")
public class CheckController {

    @Autowired
    private CheckRepository checkRepository;

    @GetMapping("/users")
    public List<Check> findCheckByUsers(@RequestBody User user){
        return checkRepository.findCheckByUsers(user);
    }

    @GetMapping("/{id}")
    public Optional<Check> findCheckById(@PathVariable Long id){
         return checkRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCheckById(@PathVariable Long id){
        checkRepository.deleteById(id);
    }
}
