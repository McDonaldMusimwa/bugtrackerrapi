package com.example.demo.usercontroller;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser() {
       return userService.getUser();
    }

    @PostMapping
    public void addNewUser(@RequestBody User user){
        userService.addUser(user);
    }
}
