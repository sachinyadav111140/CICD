package com.example.CiCd.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MainController {

    @GetMapping( "/hello")
    public ResponseEntity<String> getHello()
    {
        return new ResponseEntity<>("Hello this is vesion 1", HttpStatus.OK);
    }
}
