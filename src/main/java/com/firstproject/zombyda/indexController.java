package com.firstproject.zombyda;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@RestController
public class indexController {
    
    @GetMapping("/index")
    public String index() {
        log.debug("debug");
        log.debug("info");
        log.debug("error");
        return "index ok";
    }
}
