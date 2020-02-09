package com.example.demo.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "com")
public class ConfigBean {
    private String name;
    private String thing;
}
