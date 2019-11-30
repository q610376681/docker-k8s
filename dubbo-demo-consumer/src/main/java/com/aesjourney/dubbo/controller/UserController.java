package com.aesjourney.dubbo.controller;

import com.aesjourney.dubbo.model.UserInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.demo.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: ZhangChen
 * @Date: 2019/11/30 21:43
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    public UserService userService;
    @RequestMapping("/getbyusername")
    public UserInfo getUser(String username){
        System.out.println("开始执行"+username);
       return userService.getUserByName(username);
    }
}
