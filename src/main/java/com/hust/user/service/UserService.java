package com.hust.user.service;

import com.hust.user.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUser();
    User hasSigned(String openid);
    int signIn(String openid);
}
