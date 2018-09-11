package avto.services;

import avto.model.User;
import avto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by Adelya on 09.09.2018.
 */
@Component
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(UUID id) {
        return userRepository.getUserById(id);
    }

    public void createUser(User user) {
        user.setId(UUID.randomUUID());
        userRepository.createUser(user);
    }
}
