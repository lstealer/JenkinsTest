package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/")
    public String index() {
        return "Hello From Jenkins Automated Deployment! Jenh Hz update hi webhook plz";
    }
}
