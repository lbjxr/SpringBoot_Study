package com.lbj.study;

import com.sun.javafx.iio.gif.GIFDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 获取女生列表
     */

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 新增一条记录
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public void girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();

        girl.setAge(age);
        girl.setCupSize(cupSize);

        girlRepository.save(girl);
    }

    /**
     * 通过id获取女生
     * @param id
     * @return
     */
    @GetMapping(value = "/girlid/{id}")
    public Girl girlById(@PathVariable("id") Integer id){

        return girlRepository.getOne(2);
    }

    /**
     * 更新一条记录
     * @param id
     * @param cupSize
     * @param age
     */
    @PutMapping(value = "/girlid/{id}")
    public void girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();

        girl.setAge(age);
        girl.setCupSize(cupSize);
        girl.setId(id);

        girlRepository.save(girl);
    }

    /**
     * 通过id删除一条记录
     * @param id
     */
    @DeleteMapping(value = "/girlid/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    /**
     * 通过年龄查询记录
     * @param age
     * @return
     */
    @GetMapping(value = "/girlid/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.getGirlsByAge(age);
    }
}
