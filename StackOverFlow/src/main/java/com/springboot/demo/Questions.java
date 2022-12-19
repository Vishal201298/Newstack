package com.springboot.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;



@Entity

@Table(name = "questions")

public @Data class Questions {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "question_id")
    private long questionId;

    
    @Column(name = "question")

    private String question;

   @OneToMany(mappedBy ="question")

    private List<Answer> answer=new ArrayList<>();

    @Column(name = "langauge")

    private String langauge;
    
    
    @ManyToOne
    private User user;
    
    public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Column(name = "upvoting")

    private int upvoting;
    
    
    @Column(name = "dwvoting")

    private int dwvoting;


	public long getQuestionId() {
		return questionId;
	}


	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}




   
	public List<Answer> getAnswer() {
		return answer;
	}


	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}


	public String getLangauge() {
		return langauge;
	}


	public void setLangauge(String langauge) {
		this.langauge = langauge;
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


	

	

	public Questions(long questionId, String question, List<Answer> answer, String langauge, User user, int upvoting,
			int dwvoting) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
		this.langauge = langauge;
		this.user = user;
		this.upvoting = upvoting;
		this.dwvoting = dwvoting;
	}


	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", answer=" + answer + ", langauge="
				+ langauge + ", user=" + user + ", upvoting=" + upvoting + ", dwvoting=" + dwvoting + "]";
	}


	


	
    
    
    
 
}
