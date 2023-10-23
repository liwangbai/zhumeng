package com.wpy.zhumeng.controller;

import com.wpy.zhumeng.component.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final Person person;

    public TestController(Person person) {
        this.person = person;
    }

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        System.out.println(person);
        return "hello springboot";
    }
}


