package com.learnspringcloud.feignservice.service;

import com.learnspringcloud.feignservice.dto.CommonResult;
import com.learnspringcloud.feignservice.dto.User;
import org.springframework.stereotype.Component;

/**
 * @author: Yao Frankie
 * @date: 2020/8/16 14:47
 */
@Component
public class UserFallBackService implements UserService {
    @Override
    public CommonResult addUser(User user) {
        User defaultUser = User.of("DefaultAddUser", 18);
        return new CommonResult(defaultUser);
    }

    @Override
    public CommonResult<User> getUser(int id) {
        User defaultUser = User.of("DefaultGetUser", 18);
        return new CommonResult<>(defaultUser);
    }
}
