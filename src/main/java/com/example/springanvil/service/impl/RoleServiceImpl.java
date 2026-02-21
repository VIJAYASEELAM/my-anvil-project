package com.example.springanvil.service.impl;

import com.example.springanvil.model.Role;
import com.example.springanvil.repository.RoleRepository;
import com.example.springanvil.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role createRole(String roleName) {
        if (roleRepository.existsByName(roleName)) {
            throw new RuntimeException("Role already exists");
        }

        Role role = new Role(roleName);
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}