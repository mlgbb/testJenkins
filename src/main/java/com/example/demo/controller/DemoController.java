package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhuqf
 * 2019/7/23 14:00
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demoFunction(){
        return "demo";
    }
}
