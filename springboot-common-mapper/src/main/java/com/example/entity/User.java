package com.example.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: XiongGaoXiang
 * @Date: 2020/5/24
 */
@Data
public class User {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private String email;
}
