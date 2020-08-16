package com.learnspringcloud.feignservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: Yao Frankie
 * @date: 2020/8/15 14:47
 */
@AllArgsConstructor(staticName = "of")
@Setter
@Getter
@ToString
public class User {
    private String name;
    private int age;
}
