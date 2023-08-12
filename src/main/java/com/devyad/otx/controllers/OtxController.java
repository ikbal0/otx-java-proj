package com.devyad.otx.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtxController {
    // http Get Method
    @GetMapping("/")
    public String message() {
        return "Welcome to OTX application";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello this is OTX hello";
    }
}
