package com.dearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping(path = "/hello")
    public String sayHello()
    {
        System.out.println("执行！");
        return "success";
    }
}
