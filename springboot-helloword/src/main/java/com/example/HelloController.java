package com.example;

import com.example.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @Resource(name = "helloService")
    private HelloService helloService;

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return helloService.getString("abc");
    }

    @ResponseBody
    @GetMapping("/clearCache")
    public String clearCache(String key) {
        helloService.clearCache(key);
        return "ok";
    }
}
