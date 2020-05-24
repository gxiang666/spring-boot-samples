package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.TbOrderItem;
import com.example.mapper.TbOrderItemMapper;
import com.example.service.TbOrderItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author XiongGaoXiang
 * @since 2020-05-25
 */
@Service
public class TbOrderItemServiceImpl extends ServiceImpl<TbOrderItemMapper, TbOrderItem> implements TbOrderItemService {

}
