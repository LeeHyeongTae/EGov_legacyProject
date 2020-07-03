package com.bitcamp.web.serviceImpls;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.domains.MemberDTO;
import com.bitcamp.web.mappers.MemberMapper;
import com.bitcamp.web.mappers.TxMapper;
import com.bitcamp.web.services.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper memberMapper;
	@Autowired TxMapper txMapper;
	/* (non-Javadoc)
	 * @see services.MemberService#save()
	 */
	@Override
	public boolean save(MemberDTO param) {
		boolean res = false;
		try {
			txMapper.insertMember(param);
//			memberMapper.insertOneIntoMembers(param);
			res = true;
		}catch (Exception e) {
			System.out.println(e);
		}
		return res;
	}

	/* (non-Javadoc)
	 * @see services.MemberService#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#findOne()
	 */
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#findAll()
	 */
	@Override
	public List<MemberDTO> findAll() {
		return memberMapper.selectAll();
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#count()
	 */
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#findByEmailAndName(java.lang.String, java.lang.String)
	 */
	@Override
	public MemberDTO findByEmailAndPassword(MemberDTO param) {
		return memberMapper.selectOneFromMembers(param);
	}

	/* (non-Javadoc)
	 * @see services.MemberService#findByEmailOrName(java.lang.String, java.lang.String)
	 */
	@Override
	public void findByEmailOrName(String email, String name) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#findByCreatedAtBetween(java.util.Date, java.util.Date)
	 */
	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#findByNameLike(java.lang.String)
	 */
	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#findByAccessCodeIsNull()
	 */
	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see services.MemberService#findByEmailOrderByNameAsc(java.lang.String)
	 */
	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}
	
}
