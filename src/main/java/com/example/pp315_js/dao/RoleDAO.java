package com.example.pp315_js.dao;

import com.example.pp315_js.model.Role;

import java.util.List;

public interface RoleDAO {
    List<Role> getAllUsers();

    void save(Role role);

    void deleteById(Integer id);

    Role showUserById(Integer id);
}
