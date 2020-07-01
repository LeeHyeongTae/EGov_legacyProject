package com.bitcamp.web.services;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public interface MemberService {

	public void save();

	public void update();

	public void findOne();

	public void findAll();

	public void count();

	public void delete();

	public void findByEmailAndName(String email, String name);

	public void findByEmailOrName(String email, String name);

	public void findByCreatedAtBetween(Date fromDate, Date toDate);

	public void findByNameLike(String name);

	public void findByAccessCodeIsNull();

	public void findByEmailOrderByNameAsc(String email);

}
