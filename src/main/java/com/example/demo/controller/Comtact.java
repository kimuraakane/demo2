package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.ComtactService;

@Controller
public class Comtact {

    @Autowired
    private ComtactService comtactService;

    @GetMapping("/comtact")
    public String comtactIndex(Model model){
        String comtactMessage = comtactService.getComtactMessage();
		model.addAttribute("message",comtactMessage);
		return "fragment";
    }

}
