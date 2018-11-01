package com.lbj.study.Cotroller;

import com.lbj.study.Girl;
import com.lbj.study.GirlRepository;
import com.lbj.study.Service.GirlServiece;
import com.sun.javafx.iio.gif.GIFDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlServiece girlServiece;

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
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();

        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    /**
     * 通过id获取女生
     * @param id
     * @return
     */
    @GetMapping(value = "/girlid/{id}")
    public Girl girlsid(@PathVariable("id") Integer id){

        //新版本2.0.4release中更新，
        return girlRepository.findById(id).get();
    }

    /**
     * 更新一条记录
     * @param id
     * @param cupSize
     * @param age
     */
    @PostMapping(value = "/girlid/{id}")
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
    @GetMapping(value = "/girlid/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.getGirlsByAge(age);
    }

    /**
     * 事务控制数据
     */
    @GetMapping(value = "/girls/addTwo")
    public void addTwoGirls(){
        girlServiece.addTwo();
    }
}
