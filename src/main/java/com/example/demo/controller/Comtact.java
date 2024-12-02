package com.example.demo.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.ComtactService;

@RestController
@RequestMapping("/comtact")
public class Comtact {

    @Autowired
    private ComtactService comtactService;

    @GetMapping("/")
    public String comtactIndex(Model model){
        String comtactMessage = comtactService.getComtactMessage();
		model.addAttribute("comtactMmessage",comtactMessage);
		return "fragment";
    }

}
