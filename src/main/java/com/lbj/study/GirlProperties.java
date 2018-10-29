package com.lbj.study;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String capSize;

    private Integer age;

    public String getCapSize() {
        return capSize;
    }

    public void setCapSize(String capSize) {
        this.capSize = capSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
