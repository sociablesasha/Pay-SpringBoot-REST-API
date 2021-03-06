package com.pay.as.controller;

import com.pay.as.service.AuthService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
public class AuthController {

    @Autowired
    AuthService authService;


    @PostMapping("/auth")
    @ApiOperation(value = "Login")
    public String login(
            @RequestParam @NotNull @Size(max = 32) String identify,
            @RequestParam @NotNull @Size(max = 64) String password) {
        return authService.auth(identify, password);
    }

}
