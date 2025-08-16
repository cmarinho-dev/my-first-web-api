package br.com.marinho.my_first_web_api.controller;

import br.com.marinho.my_first_web_api.model.User;
import br.com.marinho.my_first_web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<User> getUsers() {
       return repository.findAll();
    }

    @GetMapping("/{username}")
    public User getAUser(@PathVariable("username") String username) {
        return repository.findByUserName(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }

    @PutMapping()
    public void putUser(@RequestBody User user) {
        repository.save(user);
    }
}
