package com.jewel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {

@RequestMapping("/testServletAPI")
//形参位置的request 表示当前请求

    public  String testservlet(HttpServletRequest request){
String username=request.getParameter("username");
    String password=request.getParameter("password");
    System.out.println("username is :"+username+", password is :"+password);
    return "success";
}
}
