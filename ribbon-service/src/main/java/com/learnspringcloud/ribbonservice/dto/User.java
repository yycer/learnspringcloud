package com.learnspringcloud.ribbonservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/8/15 14:47
 */
@AllArgsConstructor(staticName = "of")
@Setter
@Getter
public class User {
    private String name;
    private int age;
}
