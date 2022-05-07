package com.zhouzi.map_server.controller;

import com.zhouzi.map_server.domain.User;
import com.zhouzi.map_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author: LiuZhuo02
 * @Date: 2022/5/7 11:01
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public Optional<User> getUserById(Integer id){
        Optional<User> userById = userService.getUserById(id);
        return userById;
    }
}
