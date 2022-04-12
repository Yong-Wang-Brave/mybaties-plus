package com.baomidou.mybatisplus.samples.quickstart.controller;


import com.baomidou.mybatisplus.samples.quickstart.entity.User;
import com.baomidou.mybatisplus.samples.quickstart.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class TestPlus {
@Autowired
    UserService userService;
    @GetMapping("/test")
    public  List<User> test() {
        List<User> users = userService.queryWrapper(1);
        return users;
    }

}

