/**
 * 
 */
package com.bitcamp.web.controllers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bitcamp.web.services.MemberService;

/**
  * @FileName : PersonControllerTest.java
  * @Project : All of Bicycle
  * @Date : Jul 3, 2020 
  * @작성자 : tedd911@icloud.com
  * @변경이력 :
  * @프로그램 설명 : 자전거브랜드별 리스트와 친목 게시판.
  */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:META-INF/servlet-context.xml\",\"classpath*:META-INF/root-context.xml")
public class PersonControllerTest {
	
	/**
	 * Test method for {@link com.bitcamp.web.controllers.PersonController#join(com.bitcamp.web.domains.MemberDTO)}.
	 */
	@Test
	public void testJoin() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.bitcamp.web.controllers.PersonController#login(javax.servlet.http.HttpSession, com.bitcamp.web.domains.MemberDTO, java.lang.String)}.
	 */
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
