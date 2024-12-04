package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.AboutService;

@Controller
@ControllerAdvice
public class About {

    @Autowired
    private AboutService aboutService;

    @ModelAttribute("aboutMessage")
    public String setAboutMessage(){
        return aboutService.getAboutMessage();
    }

    @GetMapping("/about")
    public String aboutindex(){
        return "fragment";
    }
}
