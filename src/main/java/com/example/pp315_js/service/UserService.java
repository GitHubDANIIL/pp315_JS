package com.example.pp315_js.service;

import com.example.pp315_js.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findOne(int id);

    void saveUser(User user);

    void update(int id, User updatedUser);

    void deleteUser(int id);
}
