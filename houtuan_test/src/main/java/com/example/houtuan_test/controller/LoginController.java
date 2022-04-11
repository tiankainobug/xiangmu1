package com.example.houtuan_test.controller;

import com.example.houtuan_test.bean.UserBean;
import com.example.houtuan_test.service.UserService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/login/account",method = RequestMethod.POST)
    public HashMap login(String name, String password) throws JSONException {
        UserBean userBean = userService.login(name,password);
        HashMap aa = new HashMap<>();
        HashMap bb = new HashMap<>();
        aa.put("logSuccess",true);
        bb.put("logSuccess",false);
        if(userBean!=null){
            return aa;
        }else {
            return bb;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public HashMap register(String name,String password) throws JSONException {
        UserBean user = new UserBean();
        user.setId(null);
        user.setName(name);
        user.setPassword(password);
        int id = userService.register(user);
        HashMap aa = new HashMap<>();
        HashMap bb = new HashMap<>();
        aa.put("registerSuccess",true);
        bb.put("registerSuccess",false);
        System.out.println(id);
        if(id != 0){
            return aa;
        }else {
            return bb;
        }
    }

}
