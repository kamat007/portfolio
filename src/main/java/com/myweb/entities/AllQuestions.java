package com.myweb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AllQuestions {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String question;
	private String ansLink;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnsLink() {
		return ansLink;
	}
	public void setAnsLink(String ansLink) {
		this.ansLink = ansLink;
	}
	@Override
	public String toString() {
		return "AllQuestions [id=" + id + ", question=" + question + ", ansLink=" + ansLink + "]";
	}
}
