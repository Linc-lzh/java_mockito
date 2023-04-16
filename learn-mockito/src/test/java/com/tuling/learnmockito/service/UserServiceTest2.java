package com.tuling.learnmockito.service;

import com.tuling.learnmockito.dao.UserRepository;
import com.tuling.learnmockito.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class UserServiceTest2 {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Test
    void findUserById() {
        User user = new User(1L,"fox","长沙");
        Mockito.when(userRepository.findUserById(1L)).thenReturn(user);
        assertEquals(user,userService.findUserById(1L));
    }
}