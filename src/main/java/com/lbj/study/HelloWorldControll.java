package com.lbj.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControll {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String ShowHello(){
        return "Hello World!";
    }
}
