package com.gyojincompany.mvcboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.mvcboard.command.BCommand;
import com.gyojincompany.mvcboard.command.BContentViewCommand;
import com.gyojincompany.mvcboard.command.BDeleteCommand;
import com.gyojincompany.mvcboard.command.BListCommand;
import com.gyojincompany.mvcboard.command.BModifyCommand;
import com.gyojincompany.mvcboard.command.BReplyCommand;
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
	
	@RequestMapping(value = "content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BContentViewCommand();
		command.excute(model);		
		
		return "content_view";
	}
	
	@RequestMapping(value = "modify_view")
	public String modify_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BContentViewCommand();
		command.excute(model);				
		
		return "modify_view";
	}
	
	@RequestMapping(value = "modify")
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BModifyCommand();
		command.excute(model);			
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BDeleteCommand();
		command.excute(model);			
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "reply_write")
	public String reply_write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BContentViewCommand();//??? ??? ?????? ????????????
		command.excute(model);	
		
		return "reply_write";
	}
	
	@RequestMapping(value = "reply")
	public String reply(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BReplyCommand();//?????? ?????? ??????(DB??? ?????? ??????)
		command.excute(model);	
		
		return "redirect:list";
	}
	
}
