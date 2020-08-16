package com.learnspringcloud.feignservice.controller;

import com.learnspringcloud.feignservice.dto.CommonResult;
import com.learnspringcloud.feignservice.dto.User;
import com.learnspringcloud.feignservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Yao Frankie
 * @date: 2020/8/16 14:36
 */
@RestController
@RequestMapping("/feign/")
public class FeignController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public CommonResult addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/user/get")
    public CommonResult<User> getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }
}
