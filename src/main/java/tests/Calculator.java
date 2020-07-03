/**
 * 
 */
package tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitcamp.web.proxy.Box;

/**
  * @FileName : Calculator.java
  * @Project : All of Bicycle
  * @Date : Jul 3, 2020 
  * @작성자 : tedd911@icloud.com
  * @변경이력 :
  * @프로그램 설명 : 자전거브랜드별 리스트와 친목 게시판.
  */
@Component
public class Calculator {
	@Autowired Box<Integer> box;
	
	public int sum(int a, int b) {
		box.put("res", a + b);
		return box.get("res");
	}
	public int substract(int a, int b) {
		return a - b;
	}
	public int absoluteVal(int a) {
		return Math.abs(a);
	}
}
