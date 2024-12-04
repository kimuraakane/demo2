package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.TopService;

@Controller
@ControllerAdvice
public class Top {

    @Autowired
    private TopService topService;

    @ModelAttribute("topMessage")
    public String setTopMessage(){
        return topService.getTopMessage();
    }

    @GetMapping("/top")
    public String topIndex(){
        return "fragment";
    }

}
