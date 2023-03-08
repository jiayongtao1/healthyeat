package com.hust.user.service;

import com.hust.user.entity.User;
import com.hust.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }

    @Override
    public User hasSigned(String openid) {
        return userMapper.hasSigned(openid);
    }

    @Override
    public int signIn(String openid) {
        return userMapper.signIn(openid);
    }
}
