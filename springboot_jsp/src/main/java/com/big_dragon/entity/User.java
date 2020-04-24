package com.big_dragon.entity;

import java.io.Serializable;

/**
 * @author bigDragon
 * @create 2020-04-14 12:57
 */
public class User implements Serializable {

    private static final long Serializable = 1L;

    private int user_id;
    private String name;
    private String age;
    private String people_des;
    private String sex_id;


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPeople_des() {
        return people_des;
    }

    public void setPeople_des(String people_des) {
        this.people_des = people_des;
    }

    public String getSex_id() {
        return sex_id;
    }

    public void setSex_id(String sex_id) {
        this.sex_id = sex_id;
    }
}
