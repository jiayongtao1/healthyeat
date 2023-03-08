package com.hust.user.mapper;

import com.hust.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getUser();
    int signIn(String openid);
    User hasSigned(String openid);
}
