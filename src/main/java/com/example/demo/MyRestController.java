package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class MyRestController {

    @GetMapping("/")
    String firstFunction(){
        return "";
    }

}
