package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.JwtService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService jwtService;

    @GetMapping("/register")
    public User register(@RequestParam String username,
                         @RequestParam String password) {

        return userService.register(username, password);
    }

    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        User user = userService.login(username, password);

        if (user != null) {
            return jwtService.generateToken(username);
        }

        return "Login inválido";
    }

    @GetMapping("/test")
    public String test() {
        return "AUTH FUNCIONANDO";
    }
}