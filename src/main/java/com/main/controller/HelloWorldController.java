package com.main.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloWorldController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String nameGET,
            Model model) {
        model.addAttribute("nomTemplate", nameGET);
        return "greeting";
    }
}