package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @RequestMapping(value = "/rest") //example: http://localhost:8080/rest?text=Karol
    public String reverse(@RequestParam(value = "text", defaultValue = "Karol") String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(text);
        builder.reverse();
        System.out.println(builder.toString());
        return builder.toString();
    }

}
