package com.example.lecture09task.form;

import com.example.lecture09task.entity.User;
import lombok.Getter;

@Getter

public class UpdateForm {

    private String name;

    private Integer age;

    public User convertToUser(int id) {
        User updateUser = new User(id, name, age);
        return updateUser;
    }
}
