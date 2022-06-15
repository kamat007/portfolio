package com.myweb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.entities.AllQuestions;
import com.myweb.repository.QuestionRepository;
import com.myweb.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository quesRepository;

	@Override
	public List<AllQuestions> getAllQuestions() {
		return quesRepository.findAll();
	}

	@Override
	public AllQuestions saveQuestion(AllQuestions question) {
		return quesRepository.save(question);
	}
}
