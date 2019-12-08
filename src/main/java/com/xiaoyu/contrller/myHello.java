package com.xiaoyu.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myHello {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "hello - 你哈";
    }

    @RequestMapping("/list")
    public String list(){

        return "list";
    }
}
