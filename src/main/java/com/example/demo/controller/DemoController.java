package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody
/*浏览器返回的body，整个对象返回都是json。可用@RestController代替*/
@Controller
public class DemoController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping(value = "/name")
    /*浏览器展示的路由*/
    public String name() {
        return configBean.getName();
    }

    @RequestMapping(value = "/thing")
    /*浏览器展示的路由*/
    public String thing() {
        return configBean.getName();
    }


}
