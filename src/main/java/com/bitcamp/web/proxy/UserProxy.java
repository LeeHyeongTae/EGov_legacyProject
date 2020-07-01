package com.bitcamp.web.proxy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bitcamp.web.enums.Sql;

import domains.MemberDTO;
import mappers.MemberMapper;
import mappers.TxMapper;

@Component("manager")
public class UserProxy extends Proxy{
	@Autowired TxMapper txMapper;
	@Autowired Box<String> box;
	@Autowired MemberMapper memberMapper;
	
	public String makeBirthday() {
		//1970~2010
		String birthday = "";
		List<String> sen = Arrays.asList("00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18");
		List<String> year = Arrays.asList("19", "20");
		List<String> month = Arrays.asList("01", "02", "03", "04", "05", "06", "07");
		return birthday;
	}
	
	public String makeMemberEmail() {
		List<String> genderText = Arrays.asList("M","F");
		Collections.shuffle(genderText);
		return genderText.get(0);
	}
	public String makeMemberName() {
		List<String> nameText = Arrays.asList("","");
		Collections.shuffle(nameText);
		return nameText.get(0);
	}
	public String makeMemberPassword() {
		List<String> phoneNum = Arrays.asList("","");
		Collections.shuffle(phoneNum);
		return phoneNum.get(0);
	}
	public int makeMemberSeq() {
		return 0;
	}
	
	public MemberDTO makeMember() {
		return new MemberDTO(makeMemberSeq(), makeMemberName(), makeMemberEmail(), makeMemberPassword());
	}
	@Transactional //AOP 중 반복에 해당한다.
	public void insertUsers(int count) {
		for(int i = 0; i < count; i++) {
			txMapper.insertMember(makeMember());
		}
	}
	public void truncateMembers() {
		box.clear();
		box.put("TRUNCATE_MEMBERS", Sql.TRUNCATE_MEMBERS.toString());
		memberMapper.truncateMember(box.get());
	}
	public void dropMembers() {
		box.clear();
		box.put("DROP_MEMBERS", Sql.DROP_MEMBERS.toString());
		memberMapper.dropMember(box.get());
	}
}
