package com.example.spotifyyoutubetransfer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AuthController {

    @GetMapping("/user")
    public Principal getUser(Principal principal) {
        return principal;
    }
}