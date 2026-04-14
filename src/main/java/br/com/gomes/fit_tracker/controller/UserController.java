package br.com.gomes.fit_tracker.controller;

import br.com.gomes.fit_tracker.database.model.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = User.builder().name("Isaque Gomes").email("gomesnw@gmail.com").phone("9189933312").build();
        return ResponseEntity.ok().body(user);
    }
}
