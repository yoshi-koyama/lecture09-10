package com.example.lecture09task.controller;

import com.example.lecture09task.entity.User;
import com.example.lecture09task.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public List<User> selectusersid(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @GetMapping("/users")
    public List<User> selectusersage(@RequestParam (value = "age", required = false) Integer age) {
        return userService.findByAge(age);
    }
}
