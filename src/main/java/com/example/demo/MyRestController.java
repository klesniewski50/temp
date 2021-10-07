package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class MyRestController {

    @GetMapping(value = "/{text}")
    public String findById(@PathVariable("text") String text) {
        return "index";
    }

}
