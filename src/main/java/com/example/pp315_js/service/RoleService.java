package com.example.pp315_js.service;


import com.example.pp315_js.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllUsers();

    void save(Role role);

    void deleteById(Integer id);

    Role showUserById(Integer id);
}
