package com.example.demo.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String personName;
    private Boolean boss;
    private Integer age;
    private Map<String, Object> maps;
    private Dog dog;
    private List<Object> lists;

    @Override
    public String toString(){
        return "Person {" +
                "personName " + personName +
                ", boss " + boss +
                ", age " + age +
                ", maps " + maps +
                ", dog " + dog +
                ", lists " + lists +
                "}";
    }

}
