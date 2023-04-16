package com.tuling.learnmockito.service;

import com.tuling.learnmockito.dao.UserRepository;
import com.tuling.learnmockito.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User findUserById(Long id) {
    return userRepository.findUserById(id);
  }
}