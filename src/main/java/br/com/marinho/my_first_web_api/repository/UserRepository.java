package br.com.marinho.my_first_web_api.repository;

import br.com.marinho.my_first_web_api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getId()==null)
            System.out.printf("SAVE - Receiving user '%s' at repository layer", user);
        else
            System.out.printf("UPDATE - Receiving user '%s' at repository layer", user);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Getting the id '%d' to delete a user%n", id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Showing all users");
        List<User> users = new ArrayList<>();
        users.add(new User("admin","password"));
        users.add(new User("marinho","masterpass"));
        return users;
    }

    public User findById(Integer id) {
        System.out.printf("FIND/id - Getting the id '%d' to locate a user%n", id);
        return new User("marinho", "masterpass");
    }

    public User findByUserName(String username) {
        System.out.printf("FIND/username - Receiving the username '%s' to locate a user%n", username);
        return new User("marinho", "masterpass");
    }
}
