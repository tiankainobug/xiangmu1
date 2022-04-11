package com.example.houtuan_test.mapper;

import com.example.houtuan_test.bean.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserBean getInfo(String name,String password);

    int add(Integer id,String name,String password);
}
