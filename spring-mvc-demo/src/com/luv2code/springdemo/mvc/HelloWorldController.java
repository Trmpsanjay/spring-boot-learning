package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	@RequestMapping("/processFormVersionTwo")
	public String processFormV2(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		System.out.println("the name : "+name);
		name = name.toUpperCase();
		String message = "Name in upercase: "+name;
		model.addAttribute("message",message);
		return "process-form";
		
	}

}
