package com.lbj.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowGirl {


    //20181030学习使用注解方式获取配置属性

    //@Value注解方式获取
    @Value("${capSize}")
    private String capSize;

    @Value("${age}")
    private Integer age;

    //@Component
    //@ConfigurationProperties(prefix = "girl")方式
    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value = "/girl2", method = RequestMethod.GET)
    public Integer showValue2(){ return girlProperties.getAge(); }


    @RequestMapping(value = "/girl", method = RequestMethod.GET)
    public String showValue(){ return capSize + age; }

}
