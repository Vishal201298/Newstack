package com.springboot.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demo.Questions;
import com.springboot.demo.service.QuestionService;

@Controller
public class QuestionControllerj {

	private QuestionService questionService;

	public QuestionControllerj(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	@RequestMapping("/question")
	public String questionM(Model model) {
		List<Questions> questionList = questionService.getAllQuestions();
		model.addAttribute("questionList", questionList);
		return "question";
	}
//	
//	@RequestMapping("/logout")
//	public String logout(Model model) {
//		
//		return "login";
//	}
//	
	@GetMapping("add_question")
	public String addq(Model model) {
		Questions question = new Questions();
		model.addAttribute("newQuestion", question);
		return "add_question";
	}
//	
//	@RequestMapping("delete/{id}")
//	public RedirectView deleteUser(@PathVariable("id") int id,HttpServletRequest request) {
//		this.userService.deleteUser(id);
//		RedirectView redirectView=new RedirectView();
//		redirectView.setUrl(request.getContextPath()+"/");
//		return redirectView;
//	}
	
	@PostMapping(path = "/add")
	public String qregister(@ModelAttribute("newQuestion") Questions newQuestion, Model model, HttpSession session) {
		Questions QuestionSuccess = questionService.saveQuestions(newQuestion);
		List<Questions> questionList = questionService.getAllQuestions();
		model.addAttribute("questionList", questionList);
		return "question";

	}
}

