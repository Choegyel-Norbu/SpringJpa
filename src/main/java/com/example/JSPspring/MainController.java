package com.example.JSPspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/indexJsp")
    public String jspSpring(){
        return "student";
    }
}
