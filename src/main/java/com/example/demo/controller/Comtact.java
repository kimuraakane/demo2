package com.example.demo.controller;



import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.ComtactService;

@Controller
@ControllerAdvice
public class Comtact {

    @Autowired
    private ComtactService comtactService;

    @ModelAttribute("comtactMessage")
    public String setComtactMessage(){
        return comtactService.getComtactMessage();
    }

    @GetMapping("/comtact")
    public String comtactIndex(){
		return "fragment";
    }

}
