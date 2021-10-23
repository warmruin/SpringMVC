package com.jewel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {


    @RequestMapping("/testRequestByServletAPI")
    public  String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","hello,servletAPI");

        //转发
return "success";
    }


    /**
     * 测试管理制度视图
     *
     * @return {@link ModelAndView}
     */
    @RequestMapping("/testModelandView")
    public ModelAndView testModelandView(){
        ModelAndView mov=new ModelAndView();
        //处理模型数据，即向请求域request共享数据
        mov.addObject("testRequestScope","hello,modelandview");
        //设置视图名称
        mov.setViewName("success");
        return mov;
    }


    /** 使用Model向request域对象共享数据
     * 测试模型
     *
     * @param model1 model1
     * @return {@link String}
     */
    @RequestMapping("/testModel")

    public  String testModel(Model model1){
        model1.addAttribute("testRequestScope","hello,model");
        return "success";
    }


    /**
     * 使用map向request域对象共享数据
     *
     * @param map 地图
     * @return {@link String}
     */
    @RequestMapping("/testMap")

    public String testMap(Map<String,Object> map){
map.put("testRequestScope","hello,map");
return "success";
    }


    /**
     * 使用Modelmap向request域对象共享数据
     *
     * @param modelMap 模型图
     * @return {@link String}
     */
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","helloModelmap");
        return "success";
    }


    /**
     * 向session域共享数据
     *
     * @param session 会话
     * @return {@link String}
     */
    @RequestMapping("/testSession")
    public  String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,session");
        return "success";
    }


    /**
     * 向application域共享数据
     *
     * @param session 会话
     * @return {@link String}
     */
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope", "hello,application");
        return "success";
    }

}
