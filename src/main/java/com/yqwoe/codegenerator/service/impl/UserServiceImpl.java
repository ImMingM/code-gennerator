package com.yqwoe.codegenerator.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yqwoe.codegenerator.dao.UserMapper;
import com.yqwoe.codegenerator.model.User;
import com.yqwoe.codegenerator.model.param.QueryParam;
import com.yqwoe.codegenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(String uId) {
        return userMapper.selectByPrimaryKey(uId);
    }

    @Override
    public PageInfo selectAll(QueryParam param) {
        PageHelper.startPage(param.getPageNum(),param.getPageSize());
        List<User> users = userMapper.selectAll(param);
        PageInfo pageInfo = new PageInfo(users);
        return pageInfo;
    }
}
