package com.big_dragon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * @author bigDragon
 * @description: 测试controller跳转到jsp页面
 * @create 2020-04-10 17:55
 */
@Controller
@RequestMapping("/testController")
public class JSPController {

    /**
     * 测试跳转页面
     */
    @RequestMapping("/test")
    public String test(){

        return "jsp/hello";
    }

    /**
     * 测试跳转页面
     */
    @RequestMapping("/test2")
    public ModelAndView  test2(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("jsp/hello"); //返回的文件名

        mav.addObject("message","hello kitty");

        return mav;
    }

    /**
     * 测试字符串
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot!";
    }

    /**
     * 测试ajax页面
     */
    @ResponseBody
    @RequestMapping("/test_ajax")
    public String  test_ajax(@RequestBody String json){
        System.out.println("获取前台数据param："+json);
        return "success";
    }

}