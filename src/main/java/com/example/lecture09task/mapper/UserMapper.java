package com.example.lecture09task.mapper;

import com.example.lecture09task.entity.User;
import com.example.lecture09task.form.CreateForm;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    List<User> findById(int id);

    @Select("SELECT * FROM users WHERE age > #{age}")
    List<User> findByAgeGreaterThan(int age);

    @Insert("INSERT INTO users (id, name, age) VALUES (#{id}, #{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createUser(CreateForm form);
}
