package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: XiongGaoXiang
 * @Date: 2020/5/25
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
