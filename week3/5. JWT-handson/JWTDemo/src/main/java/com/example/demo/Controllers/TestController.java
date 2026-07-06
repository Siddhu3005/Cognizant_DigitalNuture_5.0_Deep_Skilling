package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Services.JWTService;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private JWTService serv;

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username,
                                        @RequestParam String password) {

        if ("admin".equals(username) && "123456".equals(password)) {
            return ResponseEntity.ok(serv.generateToken(username));
        }

        return ResponseEntity.badRequest().body("Invalid Credentials");
    }

    @GetMapping("/verify")
    public String verify(@RequestHeader("Authorization") String authHeader) {

        try {
            String token = authHeader.substring(7);
            String username = serv.extractUsername(token);
            return "Welcome : " + username;
        } catch (Exception e) {
            return "Unauthorized";
        }
    }
}