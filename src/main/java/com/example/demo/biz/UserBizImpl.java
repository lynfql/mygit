package com.example.demo.biz;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userBiz")
public class UserBizImpl implements UserBiz {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String userCode, String pwd) {
        return userMapper.getUserCodeAndPwd(userCode,pwd);
    }

    @Override
    public void deleteUser(Integer id) {
         userMapper.deleteById(new Integer(id));
    }

    @Override
    public Page<User> getAllUser(int PageNo) {
        Pageable pageable= PageRequest.of(PageNo,5);
        return userMapper.findAll(pageable);
    }
}
