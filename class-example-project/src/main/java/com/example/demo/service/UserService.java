package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    private UserMapper userMapper;
    private HashService hashService;
}
