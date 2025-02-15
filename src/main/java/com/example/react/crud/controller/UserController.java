package com.example.react.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.react.crud.model.User;
import com.example.react.crud.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
@Tag(name = "User Controller", description = "APIs for managing users") 

public class UserController {
    
    @Autowired
    private UserService userService;  // Use service instead of repository

    @GetMapping("/users")
    @Operation(summary = "Get all users", description = "Retrieve a list of all users")
    @ApiResponse(responseCode = "200", description = "Users retrieved successfully")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    @Operation(summary = "Create a new user", description = "Add a new user to the system")
    @ApiResponse(responseCode = "201", description = "User created successfully")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/users/{id}")
    @Operation(summary = "Update a user", description = "Update an existing user by ID")
    @ApiResponse(responseCode = "200", description = "User updated successfully")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }
    
    @DeleteMapping("/users/{id}")
    @Operation(summary = "Delete a user", description = "Delete a user by ID")
    @ApiResponse(responseCode = "200", description = "User deleted successfully")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
