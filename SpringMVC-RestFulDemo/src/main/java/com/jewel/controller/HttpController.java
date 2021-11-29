package com.jewel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Cris
 */
@Controller
public class HttpController {

    @RequestMapping("/testRequestBody")

    public String testRequestBody  (@RequestBody String requestBody){
    System.out.println("requestBody"+requestBody);
    return "success";
    }


    /**
     * 测试响应主体
     * 加上responseBody  变为返回到浏览器的响应体
     * @return {@link String}
     */@RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }


    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(String username, String password){
        System.out.println("username:"+username+",password:"+password);
        return "hello,ajax";
    }
}




