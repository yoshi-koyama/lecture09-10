package com.example.lecture09task.service;

import com.example.lecture09task.entity.User;
import com.example.lecture09task.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.doReturn;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @InjectMocks
    UserServiceImpl userServiceImpl;

    @Mock
    UserMapper userMapper;

    @Test
    public void 存在するユーザーのIDを指定した時に正常にユーザーが返されること() {
        doReturn(Optional.of(new User(1, "tanaka", 25))).when(userMapper).findById(1);

        User actual = userServiceImpl.findById(1);
        assertThat(actual).isEqualTo(new User(1, "tanaka", 25));
    }
}
