package com.bitcamp.web.proxy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bitcamp.web.domains.MemberDTO;
import com.bitcamp.web.enums.Sql;
import com.bitcamp.web.mappers.MemberMapper;
import com.bitcamp.web.mappers.TxMapper;

@Component("manager")
public class UserProxy extends Proxy{
	@Autowired TxMapper txMapper;
	@Autowired Box<String> box;
	@Autowired MemberMapper memberMapper;
	
//	public String makeBirthday() {
//		//1970~2010
//		String birthday = "";
//		List<String> sen = Arrays.asList("00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18");
//		List<String> year = Arrays.asList("19", "20");
//		List<String> month = Arrays.asList("01", "02", "03", "04", "05", "06", "07");
//		return birthday;
//	}
	
	public String makeMemberEmail() {
		List<String> emailText = Arrays.asList("M","F");
		Collections.shuffle(emailText);
		return emailText.get(0);
	}
	public String makeMemberName() {
		List<String> fname = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권",
				"황", "안", "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽",
				"성", "차", "주", "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현",
				"함", "변", "염", "양", "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표",
				"명", "기", "반", "왕", "금", "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구",
				"용");
		List<String> name = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노",
				"누", "다", "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미",
				"민", "바", "박", "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소",
				"솔", "수", "숙", "순", "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요",
				"용", "우", "원", "월", "위", "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전",
				"정", "제", "조", "종", "주", "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택",
				"판", "하", "한", "해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부",
				"림", "봉", "혼", "황", "량", "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱",
				"휴", "언", "령", "섬", "들", "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식",
				"란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개",
				"롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");
		Collections.shuffle(fname);
		Collections.shuffle(name);
		String fullname = fname.get(0) + name.get(0) + name.get(1);
		return fullname;
	}
//	public String makeMemberPassword() {
//		List<String> phoneNum = Arrays.asList("","");
//		Collections.shuffle(phoneNum);
//		return phoneNum.get(0);
//	}
	
	public MemberDTO makeMember() {
		return new MemberDTO(makeMemberName(), makeMemberEmail(), "1");
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
