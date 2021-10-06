package com.jewel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index() {
        //返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String a() {
        return "target";
    }


    @RequestMapping("/**/testAnt")

    public String testAnt() {
        return "success";
    }


    @RequestMapping("/testpath/{id}")
    //将占位符中的id自动赋值给我们的形参id
    public  String testpath(@PathVariable ("id") Integer id){
        System.out.println("id is:" +id);
        return "success";
    }


    @RequestMapping("/testparam")

    public String testparam(String username,String password)
    {
        System.out.println("username:"+username+"password"+password);
        return "success";
    }
}
