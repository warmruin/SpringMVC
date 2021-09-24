package com.jewel.controller;

import org.springframework.stereotype.Controller;
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
}
