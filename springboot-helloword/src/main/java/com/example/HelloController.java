package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    private List<Byte[]> bytes = new ArrayList<>();
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello Word";
    }

    @ResponseBody
    @GetMapping("/hello1")
    public String hello1() {
        bytes.add(new Byte[1024 * 1024 * 10]);
        return "hello Word";
    }
}
