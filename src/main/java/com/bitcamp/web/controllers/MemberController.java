package com.bitcamp.web.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.web.HomeController;
import com.bitcamp.web.domains.MemberDTO;
import com.bitcamp.web.enums.Messanger;
import com.bitcamp.web.services.MemberService;

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
	@GetMapping("/tamplateJoin")
	public String tamplateJoin() {
		return "account/TamplateJoin.members";
	}
	@GetMapping("/tamplateLogin")
	public String tamplateLogin() {
		return "account/TamplateLogin.members";
	}
//	@GetMapping("/{email}")
//	public Messanger login(@PathVariable String email) {
//		logger.info("userid :"+ email);
//		return (memberService.exist(email))? Messanger.SUCCESS:Messanger.FAIL;
//	}
}
