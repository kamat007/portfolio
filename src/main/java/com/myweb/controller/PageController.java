package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/home")
	public String index() {
		return "home";
	}
	
	@GetMapping("/allsheets")
	public String sheet() {
		return "sheets";
	}
	
	@GetMapping("/solved")
	public String solved() {
		return "solved";
	}
	
	@GetMapping("/unsolved")
	public String unSolved() {
		return "unsolved";
	}
	
	
}
