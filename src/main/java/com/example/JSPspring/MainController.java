package com.example.JSPspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/indexJsp")
    public String jspSpring() {
        return "i want to render some random page because it is not working jsp.";
    }
}
