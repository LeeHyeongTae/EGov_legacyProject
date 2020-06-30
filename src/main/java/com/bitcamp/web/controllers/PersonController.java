package com.bitcamp.web.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domains.MemberDTO;
import enums.Messanger;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@PostMapping("/users")
	public Messanger join(@RequestBody MemberDTO member) {
		System.out.println(member);
		return Messanger.SUCCESS;
	}
}
