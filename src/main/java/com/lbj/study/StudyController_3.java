package com.lbj.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @RequestMapping 的使用方法
 * 参数的含义:
 * value: 请求的url
 * method: 请求的方法
 */

@RestController
public class StudyController_3 {

    @Value("${age}")
    private Integer age3;

    //value的值可以是一个集合，表示集合中的url都可以访问这个方法
    @RequestMapping(value = {"/showAge3","/Age3"}, method = RequestMethod.GET)
    public String showAge3(){ return "age3: " + age3;}

    /**
     * @RequestParam 获取传统url参数的值
     * @RequesParam(value= "参数名")
     * 默认参数：
     * value: 所传参数的名
     * required: 是否必须传值
     * defaultValue： 默认传的值
     */

    @RequestMapping(value = "/requestParam", method = RequestMethod.GET)
    public String requestParam(@RequestParam(value = "id",required = false, defaultValue = "22") Integer myId){
        return "myId: " + myId;
    }

    /**
     * @PathVariable 获取url参数
     * 在@RequestMapping中预定义参数名/{path}
     * /{path} 可以存在url的任意位置
     * 该注解必须传参
     */

    @RequestMapping(value = "/pathVariable/{path}", method = RequestMethod.GET)
    public String pathVariable(@PathVariable(value = "path") Integer myPath){
        return "myPath: " + myPath;
    }
}
