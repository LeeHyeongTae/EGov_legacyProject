package com.bitcamp.web.controllers;

import java.io.Console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.HomeController;

import domains.MemberDTO;
import enums.Messanger;
import services.MemberService;

@Controller
@RequestMapping("/members")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	@Autowired MemberService memberService;
	
	@GetMapping("/login/form")
	public String loginForm() {
		logger.info("MemberController - login/form");
		return "account/Login.tiles";
	}
	
	@GetMapping("/join/form")
	public String joinForm() {
		logger.info("MemberController - join/form");
		return "account/Join.tiles";
	}
	
	@GetMapping("/tamplate")
	public String tamplate() {
		return "main/TamplateContent.members";
	}
	
	@PostMapping("/users")
	public Messanger join(@RequestBody MemberDTO member) {
		System.out.println(member);
		return Messanger.SUCCESS;
	}
//	@GetMapping("/{email}")
//	public Messanger login(@PathVariable String email) {
//		logger.info("userid :"+ email);
//		return (memberService.exist(email))? Messanger.SUCCESS:Messanger.FAIL;
//	}
}
