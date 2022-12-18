package com.sri.csrf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class CsrfController {

    @GetMapping("/home")
    public String home(){
        return "home.html";
    }

    @PostMapping("/save")
    public String home(String uname){
        System.out.println(uname);
        return "home.html";
    }
}
