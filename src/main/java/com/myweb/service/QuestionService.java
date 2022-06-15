package com.myweb.service;

import java.util.List;

import com.myweb.entities.AllQuestions;

public interface QuestionService {

	List<AllQuestions> getAllQuestions();

	AllQuestions saveQuestion(AllQuestions question);

}
