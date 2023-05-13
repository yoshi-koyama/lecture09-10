package com.example.lecture09task.service;

import com.example.lecture09task.entity.User;
import com.example.lecture09task.form.CreateForm;

import java.util.List;

public interface UserService {
    List<User> findById(int id);
    List<User> findByAge(Integer age);
    void createUser(User user);
}
