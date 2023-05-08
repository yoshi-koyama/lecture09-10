package com.example.lecture09task.service;

import com.example.lecture09task.entity.User;
import com.example.lecture09task.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    public List<User> findById(int id) {
        return userMapper.findById(id);
    }

    public List<User> findByAgeGreaterThan(int age) {
        return userMapper.findByAgeGreaterThan(age);
    }
}
