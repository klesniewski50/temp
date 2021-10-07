package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @RequestMapping(value = "/rest")
    public String reverse(@RequestParam(value = "text", defaultValue = "Karol") String text, Model model) {
        StringBuilder builder = new StringBuilder();
        builder.append(text);
        builder.reverse();
        System.out.println(builder.toString());
        model.addAttribute("reverse", builder.toString());
        return "";
    }

}
