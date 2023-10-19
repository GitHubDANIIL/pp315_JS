package com.example.pp315_js.dao;

import com.example.pp315_js.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    Optional<User> getByUsername(String username);

    List<User> findAll();

    User findOne(int id);

    void saveUser(User user);

    void update(int id, User updatedUser);

    void deleteUser(int id);
}
