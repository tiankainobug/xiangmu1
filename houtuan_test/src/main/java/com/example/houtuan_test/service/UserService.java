package com.example.houtuan_test.service;

import com.example.houtuan_test.bean.UserBean;

public interface UserService {

    UserBean login(String name,String password);

    int register(UserBean user);

}
