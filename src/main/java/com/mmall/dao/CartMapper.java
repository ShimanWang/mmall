package com.mmall.dao;

import com.mmall.pojo.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    //插入一个购物车
    int insert(Cart record);

    //根据选择的进行插入（对字段是否为空进行判断）
    int insertSelective(Cart record);

    //根据主键查询购物车对象
    Cart selectByPrimaryKey(Integer id);

    //根据主键更新
    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}