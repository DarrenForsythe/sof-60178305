package com.darrenforsythe.springsecuritybasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/security")
public class AppController {

    @GetMapping
    public String ok() {
        return "OK";
    }
}