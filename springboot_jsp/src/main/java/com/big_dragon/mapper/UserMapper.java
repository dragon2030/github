package com.big_dragon.mapper;

import com.big_dragon.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author bigDragon
 * @create 2020-04-14 13:04
 */
@Repository
public interface UserMapper {

    /**
     * 获取全部user表数据
     * @return
     */
    List<User> findAllUser();

}
