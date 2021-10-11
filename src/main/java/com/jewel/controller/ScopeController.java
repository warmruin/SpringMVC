package com.jewel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ScopeController {


    @RequestMapping("/testRequestByServletAPI")
    public  String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","hello,servletAPI");

        //转发
return "success";
    }
}
