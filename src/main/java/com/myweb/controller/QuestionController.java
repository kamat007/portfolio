package com.myweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myweb.service.QuestionService;

@Controller
@RequestMapping("/questions")
public class QuestionController {

	@Autowired
	private QuestionService quesService;
	
	@GetMapping()
	public String listStudent() {
		return "allquestions";
	}
	
	@GetMapping("/add")
	public String addQuestion() {
		return "addQuestion";
	}
}
