package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @GetMapping("/private")
    public String privateRoute(HttpServletRequest request) {
        return "ROTA PROTEGIDA - usuário: " + request.getAttribute("username");
    }
}