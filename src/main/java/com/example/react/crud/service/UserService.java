package com.example.react.crud.service;


import java.util.List;

import com.example.react.crud.model.User;

public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
}
