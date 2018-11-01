package com.lbj.study.Service;

import com.lbj.study.Girl;
import com.lbj.study.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlServiece {

    @Autowired
    GirlRepository girlRepository;

    @Transactional
    public void addTwo(){
        Girl girlA  = new Girl();
        girlA.setCupSize("B");
        girlA.setAge(18);

        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(11);
        girlB.setCupSize("YY");

        girlRepository.save(girlB);
    }
}
