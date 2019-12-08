package com.xiaoyu.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginContrller {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username ,@RequestParam("password") String password ){

        System.out.println("账号"+username);
        System.out.println("密码"+password);

        return "dashboard";
    }
}
