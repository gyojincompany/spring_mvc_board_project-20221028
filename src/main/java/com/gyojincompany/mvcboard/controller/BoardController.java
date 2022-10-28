package com.gyojincompany.mvcboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.mvcboard.command.BCommand;
import com.gyojincompany.mvcboard.command.BListCommand;
import com.gyojincompany.mvcboard.command.BWriteCommand;

@Controller
public class BoardController {
	
	BCommand command = null;
	
	@RequestMapping(value = "/")
	public String goList() {
		return "redirect:list";
	}
	
	@RequestMapping(value = "list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.excute(model);
		
		return "list";
	}
	
	@RequestMapping(value = "write_form")
	public String write_form() {
		return "write_form";
	}
	
	@RequestMapping(value = "write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BWriteCommand();
		command.excute(model);
		
		return "redirect:list";
	}
	
}
