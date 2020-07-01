package mappers;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import domains.MemberDTO;

@Repository
public interface MemberMapper {
	public void insertOneIntoMembers(MemberDTO member);
	public MemberDTO selectOneFromMembers(MemberDTO member);
//	public void exist(String email);
	/**
	 * @param hashMap
	 */
	public void truncateMember(HashMap<String, String> hashMap);
	/**
	 * @param hashMap
	 */
	public void dropMember(HashMap<String, String> hashMap);
}
