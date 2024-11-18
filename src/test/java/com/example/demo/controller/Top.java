package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.TopService;

@Controller
public class Top {
	@Autowired
	private TopService topService;
	
	@GetMapping("/")
	public String index(Model model) {
		String message = topService.getTopMessage();
		model.addAttribute("message", message);
		return "fragment";
	}
}
