package com.myweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myweb.entities.AllQuestions;

@Repository
public interface QuestionRepository extends JpaRepository<AllQuestions, Integer> {

}
