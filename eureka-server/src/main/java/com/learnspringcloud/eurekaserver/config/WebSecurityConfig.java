package com.learnspringcloud.eurekaserver.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author: Yao Frankie
 * @date: 2020/8/15 14:01
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity hs) throws Exception {
        hs.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(hs);
    }
}
