package com.perth.project.Login.Protected;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProtectedEndPoints {

    @PostMapping(value = "Home")
    public String welcome() {

        return "security end point";
    }

}