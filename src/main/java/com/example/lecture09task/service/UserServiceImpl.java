package com.example.lecture09task.service;

import com.example.lecture09task.entity.User;
import com.example.lecture09task.form.CreateForm;
import com.example.lecture09task.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> findById(int id) {
        return userMapper.findById(id);
    }

    public List<User> findByAge(Integer age) {
        if (age != null) {
            return userMapper.findByAgeGreaterThan(age);
        } else {
            return userMapper.findAll();
        }
    }

    @Override
    public User createUser(CreateForm form) {
        User user = new User(form.getName(), form.getAge());
        userMapper.createUser(user);
        return user;
    }
}
