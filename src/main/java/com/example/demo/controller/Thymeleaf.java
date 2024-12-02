package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Thymeleaf {

	@GetMapping("/")
	public String index(Model model) {
		User user = new User();
		user.setName("田中太郎");
		user.setEmail("tanaka.taro@example.com");
		user.setTel("000-000-0000");
		
		model.addAttribute("user",user);
		model.addAttribute("forms",java.util.Arrays.asList("︎〇〇〇の問い合わせ","×××の問い合せ","△△△の問い合せ"));

		//ラジオボタン
		String[] radioOptions = {"⚪︎⚪︎⚪︎の問い合わせ", "×××の問い合せ", "△△△の問い合せ"};
		model.addAttribute("radioOptions", radioOptions);
		
		return "Thymeleaf";

	}

	
}

