package com.bitcamp.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.domains.MemberDTO;

@Repository
public interface TxMapper {
	@Insert("insert into members () values #{name}, #{email}, #{password}")
	public void insertMember(MemberDTO member);
}
