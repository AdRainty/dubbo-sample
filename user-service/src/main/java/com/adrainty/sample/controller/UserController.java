package com.adrainty.sample.controller;

import com.adrainty.sample.bean.User;
import com.adrainty.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 22:22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public User getUserInfo(@RequestParam String userId) {
        return userService.getUserInfo(userId);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.add(user);
    }
}
