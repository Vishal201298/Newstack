package com.springboot.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;



@Entity

@Table(name = "answers")

public @Data class Answer {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "answer_Id")
    private long answerId;


    @Column(name = "answer")

    private String answer;

    
    @ManyToOne
    private Questions question;
    
    @Column(name = "upvoting")

    private int upvoting;
    
    
    @Column(name = "dwvoting")

    private int dwvoting;


	public long getAnswerId() {
		return answerId;
	}


	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Questions getQuestion() {
		return question;
	}


	public void setQuestion(Questions question) {
		this.question = question;
	}


	public int getUpvoting() {
		return upvoting;
	}


	public void setUpvoting(int upvoting) {
		this.upvoting = upvoting;
	}


	public int getDwvoting() {
		return dwvoting;
	}


	public void setDwvoting(int dwvoting) {
		this.dwvoting = dwvoting;
	}


	public Answer(long answerId, String answer, Questions question, int upvoting, int dwvoting) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
		this.upvoting = upvoting;
		this.dwvoting = dwvoting;
	}


	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + ", question=" + question + ", upvoting="
				+ upvoting + ", dwvoting=" + dwvoting + "]";
	}
    
    
    
   }