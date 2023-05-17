package com.example.lecture09task.mapper;

import com.example.lecture09task.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(int id);

    @Select("SELECT * FROM users WHERE age > #{age}")
    List<User> findByAgeGreaterThan(int age);

    @Insert("INSERT INTO users (name, age) VALUES (#{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createUser(User user);

    @Update("UPDATE users SET name = #{name}, age = #{age} where id = #{id}")
    void updateUser(User updateUser);
}
