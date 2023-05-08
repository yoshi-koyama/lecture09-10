package com.example.lecture09task.controller;

import com.example.lecture09task.entity.User;
import com.example.lecture09task.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> allusers() {
        return userService.findAll();
    }

    @GetMapping("/users/id")
    public List<User> selectusersid(@RequestParam (value = "id") int id) {
        return userService.findById(id);
    }

    @GetMapping("/users/age")
    public List<User> selectusersage(@RequestParam (value = "age") int age) {
        return userService.findByAgeGreaterThan(age);
    }

}
