package com.example.demo.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Data
@Component
@PropertySource(value = {"classpath:person.properties"})
/*
*可以指定在类路径下的配置文件，比如，现在该方法指定person.properties配置文件
* 注意：
* @PropertySource(value = {"classpath:person.properties"})
* 中的classpath:<紧接着person.properties>，不能有空格，否则找不到文件
* 该方法加载的配置文件优先级低于application.properties/application.yml，
* 如果想生效，需要先move掉application.properties/application.yml。
*
* 不支持person.yml, https://docs.spring.io/spring-boot/docs/1.1.4.RELEASE/reference/htmlsingle/
* 21.5.4 YAML shortcomings
YAML files can’t be loaded via the @PropertySource annotation. So in the case that you need to load values that way, you need to use a properties file.
*
 * */
@ConfigurationProperties(prefix = "person")
/*
*
@ConfigurationProperties(prefix = "person") 默认加载全局配置文件application.properties
* 或者 applications.yml 中的配置变量
* */
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
