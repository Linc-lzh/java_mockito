package com.tuling.learnmockito.dao;

import com.tuling.learnmockito.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

  User findUserById(Long id);

}