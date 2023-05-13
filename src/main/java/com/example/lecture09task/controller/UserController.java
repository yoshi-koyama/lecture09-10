package com.example.lecture09task.controller;

import com.example.lecture09task.entity.User;
import com.example.lecture09task.form.CreateForm;
import com.example.lecture09task.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public List<User> selectUserById(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @GetMapping("/users")
    public List<User> selectUsersByAge(@RequestParam (value = "age", required = false) Integer age) {
        return userService.findByAge(age);
    }

    @PostMapping("/users")
    public ResponseEntity<Map<String, String>> create(
            @RequestBody @Validated CreateForm form, UriComponentsBuilder uriBuilder) {
        User user = userService.createUser(form);
        URI url = uriBuilder
                .path("/users/" + user.getId())
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "user successfully created"));
    }
}
