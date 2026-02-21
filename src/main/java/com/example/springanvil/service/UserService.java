package com.example.springanvil.service;

import com.example.springanvil.model.User;

import java.util.List;

public interface UserService {

    User createUser(String username, String email, String password);

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(Long id, String username, String email);

    void deleteUser(Long id);

    User assignRoleToUser(Long userId, String roleName);
}