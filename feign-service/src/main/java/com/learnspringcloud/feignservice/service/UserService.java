package com.learnspringcloud.feignservice.service;

import com.learnspringcloud.feignservice.dto.CommonResult;
import com.learnspringcloud.feignservice.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Yao Frankie
 * @date: 2020/8/16 14:38
 */
@FeignClient(value = "user-service", fallback = UserFallBackService.class)
public interface UserService {

    @PostMapping("/user/add")
    CommonResult addUser(@RequestBody User user);

    @GetMapping("/user/get")
    CommonResult<User> getUser(@RequestParam("id") int id);
}
