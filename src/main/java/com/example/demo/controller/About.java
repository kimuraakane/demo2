package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.AboutService;

@RestController
@RequestMapping("/about")
public class About {

    @Autowired
    private AboutService aboutService;

    @GetMapping("/")
    public String aboutindex(Model model){
        String aboutMessage = aboutService.getAboutMessage();
        model.addAttribute("aboutMessage", aboutMessage);
        return "fragment";
    }
}
