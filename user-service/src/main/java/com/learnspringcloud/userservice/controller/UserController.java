package com.learnspringcloud.userservice.controller;

import com.learnspringcloud.userservice.dto.CommonResult;
import com.learnspringcloud.userservice.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Yao Frankie
 * @date: 2020/8/15 14:28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/add")
    public CommonResult addUser(@RequestBody User user){
        System.out.println(user);
        return new CommonResult("操作成功", 200);
    }

    @GetMapping("/get")
    public CommonResult<User> getUser(@RequestParam("id") int id){
        User user = User.of("yyc", 24);
        return new CommonResult<>(user);
    }
}
