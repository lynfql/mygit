package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.biz.UserBiz;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @Autowired
    private UserBiz userBiz;
    @GetMapping("/getData")
    public String get(String callback){
        Page<User> user = userBiz.getAllUser(0);
        String string = JSON.toJSONString(user);
        return callback+"("+string+")";
    }
}
