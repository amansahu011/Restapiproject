package in.sp.backrend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import in.sp.backrend.model.User;
import in.sp.backrend.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ 1. Data Insert Karna (POST API)
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // ✅ 2. Sare Users Fetch Karna (GET API)
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}

