package com.bitcamp.web.services;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.bitcamp.web.domains.MemberDTO;

@Component
public interface MemberService {

	public boolean save(MemberDTO member);

	public void update();

	public void findOne();

	public void findAll();

	public void count();

	public void delete();

	public MemberDTO findByEmailAndPassword(MemberDTO member);

	public void findByEmailOrName(String email, String name);

	public void findByCreatedAtBetween(Date fromDate, Date toDate);

	public void findByNameLike(String name);

	public void findByAccessCodeIsNull();

	public void findByEmailOrderByNameAsc(String email);

}
