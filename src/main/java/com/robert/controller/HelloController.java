package com.robert.controller;

import com.robert.config.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author robert
 * @date 2017/7/5
 */
@RestController
public class HelloController {

    private final PersonConfig personConfig;

    @Autowired
    public HelloController(PersonConfig personConfig) {
        this.personConfig = personConfig;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello, Spring Boot";
    }

    @RequestMapping("/property")
    public PersonConfig getProperty() {
        return personConfig;
    }
}
