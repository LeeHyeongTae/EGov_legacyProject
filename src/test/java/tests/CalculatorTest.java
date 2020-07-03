/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.hamcrest.CoreMatchers.*;
/**
  * @FileName : CalculatorTest.java
  * @Project : All of Bicycle
  * @Date : Jul 3, 2020 
  * @작성자 : tedd911@icloud.com
  * @변경이력 :
  * @프로그램 설명 : 자전거브랜드별 리스트와 친목 게시판.
  */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})
public class CalculatorTest {
	@Autowired Calculator mock;
	/**
	 * Test method for {@link tests.Calculator#sum(int, int)}.
	 */
	@Test
	public void testSum() {
		assertThat(mock.sum(1, 1), equalTo(2));
	}

	/**
	 * Test method for {@link tests.Calculator#substract(int, int)}.
	 */
	@Ignore
	public void testSubstract() {
		assertThat(mock.substract(1, 1), equalTo(0));
	}

	/**
	 * Test method for {@link tests.Calculator#absoluteVal(int)}.
	 */
	@Ignore
	public void testAbsoluteVal() {
		assertThat(mock.absoluteVal(-2), equalTo(2));
	}

}
