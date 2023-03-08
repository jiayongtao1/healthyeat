package com.hust.user.controller;

import com.hust.user.entity.User;
import com.hust.user.service.UserService;
import com.hust.util.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser(){
        return userService.getUser();
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public String login(String code){
        String res=HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session",
                "appid=wxcf60c74fe8490b01&secret=b7ce027595cec422c1e25a13f4639843&js_code="+code+"&grant_type=authorization_code");
        String[] strs=res.split("\"");
        String openid=strs[strs.length-2];
        if (userService.hasSigned(openid)==null){
            userService.signIn(openid);
        }
        return openid;
    }
}
