package com.wpy.zhumeng.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private int age;

}
