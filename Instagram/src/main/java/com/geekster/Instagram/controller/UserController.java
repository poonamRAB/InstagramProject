package com.geekster.Instagram.controller;

import com.geekster.Instagram.dto.SignInInput;
import com.geekster.Instagram.model.User;
import com.geekster.Instagram.service.AuthenticationService;
import com.geekster.Instagram.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Validated
@RestController

public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    //sign In
    @PostMapping("user/signIn")
    public String signInUser(@RequestBody @Valid SignInInput signInInput){
        return userService.signInUser(signInInput);
    }


    //sign Up
    @PostMapping("user/signUp")
    public String signUpUser(@RequestBody User user){
        return userService.signUpUser(user);
    }

    //update user details
    public String updateDetail(@RequestBody User user, @RequestBody User email){
        return userService.updateDetail(user,email);
    }
}
