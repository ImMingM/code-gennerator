package com.yqwoe.codegenerator;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.github.pagehelper.PageInfo;
import com.yqwoe.codegenerator.dao.UserMapper;
import com.yqwoe.codegenerator.model.User;
import com.yqwoe.codegenerator.model.param.QueryParam;
import com.yqwoe.codegenerator.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DruidDataSourceAutoConfigure.class})
@RestController("/demo")
@MapperScan("com.yqwoe.codegenerator.dao")
public class CodeGeneratorApplication {

    @Autowired
    UserService userMapper;

    @GetMapping
    public PageInfo index(QueryParam param){
        return userMapper.selectAll(param);
    }

    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApplication.class, args);
    }
}
