package avto.controllers;

import avto.model.User;
import avto.services.UserServices;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Adelya on 09.09.2018.
 */

@RestController
@RequestMapping("${rest.prefix}/users")
@Api(value = "usersController", description = "Operations with employee")
public class UserController {
    @Autowired
    private UserServices userServices;

    @PostMapping(value = "/{id}")
    public User getUserById(@PathVariable String id) {
        return userServices.getUserById(UUID.fromString(id));
    }

    @PostMapping(value = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee( @RequestBody User user) {
       userServices.createUser(user);
    }
}
