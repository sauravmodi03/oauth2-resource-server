package com.oauth.resource.controller;

import com.oauth.resource.dto.UsersDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("getuserinfo")
    public String getUser(){
        return "User Details here";
    }

}
