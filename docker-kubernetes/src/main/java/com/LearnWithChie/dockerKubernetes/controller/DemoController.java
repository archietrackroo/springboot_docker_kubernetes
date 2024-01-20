package com.LearnWithChie.dockerKubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/test-docker-demo")
    public String getData(){
        return "I am trying Docker. This is a Demo";
    }
}
