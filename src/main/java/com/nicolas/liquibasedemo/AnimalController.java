package com.nicolas.liquibasedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {



    @GetMapping
    public String ola() {
        return "ola";
    }
}
