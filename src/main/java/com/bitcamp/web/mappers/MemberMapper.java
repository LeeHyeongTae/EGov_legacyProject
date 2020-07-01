package com.bitcamp.web.mappers;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.bitcamp.web.domains.MemberDTO;

@Repository
public interface MemberMapper {
	public void insertOneIntoMembers(MemberDTO member);
	public MemberDTO selectOneFromMembers(MemberDTO member);
	public void truncateMember(HashMap<String, String> hashMap);
	public void dropMember(HashMap<String, String> hashMap);
}
