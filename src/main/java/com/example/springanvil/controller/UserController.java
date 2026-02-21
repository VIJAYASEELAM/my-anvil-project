package com.example.springanvil.controller;

import com.example.springanvil.model.User;
import com.example.springanvil.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestParam String username,
                           @RequestParam String email,
                           @RequestParam String password) {
        return userService.createUser(username, email, password);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,
                           @RequestParam String username,
                           @RequestParam String email) {
        return userService.updateUser(id, username, email);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("/{id}/roles")
    public User assignRole(@PathVariable Long id,
                           @RequestParam String roleName) {
        return userService.assignRoleToUser(id, roleName);
    }
}