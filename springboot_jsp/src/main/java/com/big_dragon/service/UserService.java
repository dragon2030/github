package com.big_dragon.service;

import com.big_dragon.entity.User;

import java.util.List;

/**
 * @author bigDragon
 * @create 2020-04-14 12:55
 */
public interface UserService {
    /**
     * 或许所有user表数据
     * @return
     */
    List<User> getUsers();
}
