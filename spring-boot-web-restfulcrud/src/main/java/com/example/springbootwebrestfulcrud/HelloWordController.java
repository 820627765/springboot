package com.example.springbootwebrestfulcrud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello word!";
    }
}
