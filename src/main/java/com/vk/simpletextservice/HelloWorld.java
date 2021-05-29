package com.vk.simpletextservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @RequestMapping("/text")
    public @ResponseBody String helloText() {
        return "Hello World!";
    }

}
