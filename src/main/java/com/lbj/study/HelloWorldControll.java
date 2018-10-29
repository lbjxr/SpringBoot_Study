package com.lbj.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControll {

    //20181029学习第一个springboot程序
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String ShowHello(){
        return "Hello World!";
    }
}
