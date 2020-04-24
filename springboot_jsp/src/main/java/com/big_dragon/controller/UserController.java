package com.big_dragon.controller;

import com.alibaba.fastjson.JSON;
import com.big_dragon.entity.User;
import com.big_dragon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author bigDragon
 * @create 2020-04-14 12:52
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 测试跳转页面
     */
    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(){
        List<User> users =userService.getUsers();
        System.out.println(JSON.toJSONString(users));
        return JSON.toJSONString(users);
    }

}
