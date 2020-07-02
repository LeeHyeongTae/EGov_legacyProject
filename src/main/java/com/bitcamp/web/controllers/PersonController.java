package com.bitcamp.web.controllers;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.web.domains.MemberDTO;
import com.bitcamp.web.enums.Messanger;
import com.bitcamp.web.services.MemberService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	

	@PostMapping("/users")
	public Messanger join(@RequestBody MemberDTO member) {
		logger.info("personController join : " + member.toString());
		return(memberService.save(member))? Messanger.SUCCESS:Messanger.FAIL;
	}
	
	@PostMapping("/users/{email}")
	public MemberDTO login(HttpSession session, @RequestBody MemberDTO member, @PathVariable String email) {
		MemberDTO returnMember = memberService.findByEmailAndPassword(member);
		session.setAttribute("session", returnMember);
		return returnMember;
	}
}
