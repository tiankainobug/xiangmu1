package com.example.houtuan_test.serviceImpl;

import com.example.houtuan_test.bean.UserBean;
import com.example.houtuan_test.mapper.UserMapper;
import com.example.houtuan_test.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean login(String name,String password){
        return userMapper.getInfo(name,password);
    }

    @Override
    public int register(UserBean user) {
        return userMapper.add(user.getId(),user.getName(),user.getPassword());
    }
}
