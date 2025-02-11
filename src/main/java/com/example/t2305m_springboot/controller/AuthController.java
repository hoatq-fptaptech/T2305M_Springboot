package com.example.t2305m_springboot.controller;

import com.example.t2305m_springboot.dto.req.RegisterUser;
import com.example.t2305m_springboot.entity.User;
import com.example.t2305m_springboot.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthenticationService authenticationService;

    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterUser req){
        User user = authenticationService.signup(req);
        return ResponseEntity.ok(user);
    }
}
