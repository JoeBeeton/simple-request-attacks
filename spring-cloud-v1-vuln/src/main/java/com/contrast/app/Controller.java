package com.contrast.app;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/test")
    public String getRequest() {
        return "hello";
    }
}
