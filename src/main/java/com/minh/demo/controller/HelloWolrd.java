package com.minh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MinhNhat Tran on 8/23/18.
 */
@RestController
public class HelloWolrd
{
    @GetMapping("/hello")
    public String echoHello() {
        return "Hello There!";
    }
}
