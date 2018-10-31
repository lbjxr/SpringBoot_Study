package com.lbj.study;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //自定义方法，通过年龄查询
    //方法名有严格规定，不能随意书写
    public List<Girl> getGirlsByAge(Integer age);
}
