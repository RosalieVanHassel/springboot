package com.capgemini.Springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class endPointBoot {

    @GetMapping("/api")
    public String sendJojo(){
        System.out.println("jojo");
        return "jojo";
    }
}
