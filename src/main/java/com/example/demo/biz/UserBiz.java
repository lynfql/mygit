package com.example.demo.biz;

import com.example.demo.pojo.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserBiz {
    User login(String userCode, String pwd);

    void deleteUser(Integer id);

    Page<User> getAllUser(int PageNo);
}
