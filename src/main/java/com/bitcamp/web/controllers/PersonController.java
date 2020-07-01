package com.bitcamp.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.web.enums.Messanger;

import domains.MemberDTO;
import mappers.MemberMapper;

@RestController
@RequestMapping("/person")
public class PersonController {
//	@Autowired MemberMapper memberMapper;
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	

	@PostMapping("/users")
	public Messanger join(@RequestBody MemberDTO member) {
		logger.info("personController join : " + member.toString());
		System.out.println(member);
		return Messanger.SUCCESS;
	}
}
