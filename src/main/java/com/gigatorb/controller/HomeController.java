package com.gigatorb.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @GetMapping("/welcome")
    public String home(){
        String text="This is private page ";
        text+="this page is not allowed to unauthenticated users";
        return text;
    }
}
