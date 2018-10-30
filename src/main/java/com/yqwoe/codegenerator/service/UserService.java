package com.yqwoe.codegenerator.service;


import com.github.pagehelper.PageInfo;
import com.yqwoe.codegenerator.model.User;
import com.yqwoe.codegenerator.model.param.QueryParam;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User selectByPrimaryKey(String uId);

    PageInfo selectAll(QueryParam param);
}
