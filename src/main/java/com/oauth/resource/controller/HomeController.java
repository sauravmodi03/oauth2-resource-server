package com.oauth.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String unsecured(){
        return "Unsecured";
    }

    @GetMapping("/home")
    public String authenticated(){
        return "Hello from resource";
    }
}
