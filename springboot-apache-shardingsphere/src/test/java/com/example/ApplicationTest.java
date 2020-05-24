package com.example;

import com.example.entity.TbOrder;
import com.example.mapper.TbOrderMapper;
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
    private TbOrderMapper orderMapper;

    @Test
    public void test01() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(1L);
        tbOrder.setUserId(1L);
        int insert = orderMapper.insert(tbOrder);
        System.out.println(insert);
    }
}
