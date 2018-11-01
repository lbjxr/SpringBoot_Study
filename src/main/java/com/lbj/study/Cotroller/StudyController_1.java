package com.lbj.study.Cotroller;

/*
*传统注解@Controller
* 如果传json格式的数据，需要配合@ResponseBody使用
  */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class StudyController_1 {

    @Value("${age}")
    private Integer age;

    @RequestMapping(value = "/showAge", method = RequestMethod.GET)
    public String showAge(){
        return "age:" + age;
    }

}
