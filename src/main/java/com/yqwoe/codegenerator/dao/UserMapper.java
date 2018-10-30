package com.yqwoe.codegenerator.dao;

import com.yqwoe.codegenerator.model.User;
import com.yqwoe.codegenerator.model.param.QueryParam;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll(QueryParam param);
}