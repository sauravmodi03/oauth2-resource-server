package com.oauth.resource.controller;

import com.oauth.resource.dto.UserDto;
import com.oauth.resource.modal.user.User;
import com.oauth.resource.services.UserService;
import com.oauth.resource.utility.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String test(){
        return "Working";
    }

    @GetMapping("all")
    public String getUser(){
        return userService.findAll().toString();
    }

    @GetMapping("get")
    public String getUser(@RequestParam String email){
        return Mapper.getJSON(userService.getUserByEmail(email));
    }

    @PostMapping("register")
    public void registerUser(@RequestBody UserDto user) {
        userService.registerUser(user);
    }

}
