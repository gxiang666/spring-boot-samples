package com.example;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: XiongGaoXiang
 * @Date: 2020/5/25
 */
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01(){
        User user = new User();
        user.setEmail("111111@qq.com");
        user.setName("gaoxiang");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }
}
