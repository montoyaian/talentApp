package com.perth.project.Login.Auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final Authservice authService;

    @PostMapping(value = "Login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {

        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "Register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {

        return ResponseEntity.ok(authService.register(request));
    }
}