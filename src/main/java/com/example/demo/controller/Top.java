package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.TopService;

@RestController
@RequestMapping("/top")
public class Top {

    @Autowired
    private TopService topService;

    @GetMapping("/")
    public String topIndex(Model model){
        String topMessage = topService.getTopMessage();
        model.addAttribute("topMessage", topMessage);
        return "fragment";
    }

}
