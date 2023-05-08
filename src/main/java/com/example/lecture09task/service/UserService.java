package com.example.lecture09task.service;

import com.example.lecture09task.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    List<User> findById(int id);
    List<User> findByAgeGreaterThan(int age);
}
