package com.example.demoProject.controller;

import com.example.demoProject.Validation.CreateUserGroup;
import com.example.demoProject.Validation.UpdateUserGroup;
import com.example.demoProject.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class UserController {

    @Value("${server.port}")
    private int port;

    @PostMapping("/users")
    public String createUser(@Validated(CreateUserGroup.class) @RequestBody User user) {
        // If validation passes, return success message
        return "User created successfully!";
    }

    @PutMapping("/users")
    public String updateUser(@Validated(UpdateUserGroup.class) @RequestBody User user) {
        // If validation passes, return success message
        return "User updated successfully!";
    }

    @PostMapping("/custom")
    public String checkCreateUser(@Valid @RequestBody User user) {
        // If validation passes, return success message
        return "User created successfully!";
    }

    @GetMapping("/")
    public String fun() {
        return "hello world";
    }

}
