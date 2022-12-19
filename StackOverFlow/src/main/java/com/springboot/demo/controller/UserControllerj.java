package com.springboot.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demo.service.UserService;
import com.springboot.demo.User;


@Controller
public class UserControllerj {

	private UserService userService;

	public UserControllerj(UserService userService) {
		super();
		this.userService = userService;
	}
	@RequestMapping("/user")
	public String userM(Model model) {
		List<User> userList = userService.getAllUsers();
		model.addAttribute("userList", userList);
		return "user";
	}
	
	@RequestMapping("/logout")
	public String logout(Model model) {
		
		return "login";
	}
	
	@GetMapping("add_user")
	public String addu(Model model) {
		User user = new User();
		model.addAttribute("newUser", user);
		return "add_user";
	}
	
//	@RequestMapping("delete/{id}")
//	public RedirectView deleteUser(@PathVariable("id") int id,HttpServletRequest request) {
//		this.userService.deleteUser(id);
//		RedirectView redirectView=new RedirectView();
//		redirectView.setUrl(request.getContextPath()+"/");
//		return redirectView;
//	}
	
	@PostMapping(path = "/register")
	public String register(@ModelAttribute("newUser") User newUser, Model model, HttpSession session) {
		User UserCreationSuccess = userService.saveUser(newUser);
		List<User> userList = userService.getAllUsers();
		model.addAttribute("userList", userList);
		return "user";

	}
}


