package com.lbj.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 复合型controller
 * @RestController相当于@ResponseBody加@Controller
 */

@RestController
public class StudyContoller_2 {

    @Value("${age}")
    private Integer age2;

    @RequestMapping(value = "/showAge2", method = RequestMethod.GET)
    public String showage2(){ return "age2: " + age2;}
}
