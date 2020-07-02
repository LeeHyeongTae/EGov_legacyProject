/**
 * 
 */
package tests;

/**
  * @FileName : ConsolePrinter.java
  * @Project : All of Bicycle
  * @Date : Jul 2, 2020 
  * @작성자 : tedd911@icloud.com
  * @변경이력 :
  * @프로그램 설명 : junit test impl
  */
import org.springframework.stereotype.Component;

@Component("conPrinter")
public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
