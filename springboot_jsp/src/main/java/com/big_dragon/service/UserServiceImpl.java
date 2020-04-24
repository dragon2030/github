package com.big_dragon.service;

import com.big_dragon.entity.User;
import com.big_dragon.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bigDragon
 * @create 2020-04-14 13:02
 */
@Service
/*@Transactional*/
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.findAllUser();
    }
}
