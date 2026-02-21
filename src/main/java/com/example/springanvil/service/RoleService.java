package com.example.springanvil.service;

import com.example.springanvil.model.Role;

import java.util.List;

public interface RoleService {

    Role createRole(String roleName);

    List<Role> getAllRoles();
}