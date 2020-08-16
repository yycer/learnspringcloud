package com.learnspringcloud.ribbonservice.controller;

import com.learnspringcloud.ribbonservice.dto.CommonResult;
import com.learnspringcloud.ribbonservice.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Yao Frankie
 * @date: 2020/8/15 14:58
 */
@RestController
@RequestMapping("/user")
public class RibbonUserController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @PostMapping("/add")
    public CommonResult addUser(@RequestBody User user){
        System.out.println("Add user from ribbon service");
        return restTemplate.postForObject(userServiceUrl + "/user/add", user, CommonResult.class);
    }

    @GetMapping("/get")
    public CommonResult getUser(@RequestParam("id") int id){
        System.out.println("Get user from ribbon service");
        return restTemplate.getForObject(userServiceUrl + "/user/get/id={1}", CommonResult.class, id);
    }
}
