package com.jeff.controller;

import com.jeff.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController = @Controller + @ResponseBody
 */
@RestController
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(person);
        return "Hello World";
    }
}
