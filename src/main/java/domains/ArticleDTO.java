package domains;
/**
 * @FileName : ArticleDTO.java
 * @Project : 게시판
 * @Date : ${date} 
 * @작성자 : tedd911@icloud.com
 * @변경이력 : 
 * @프로그램 설명 : 게시글DTO
 * articleNumber -
 * fileNumber -
 * email -
 * comment -
 * message -
 * rating -
 * boardType -
 * title - 
 * content -
 */
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Lazy
@Component
public class ArticleDTO {
	private int artSeq, imageSeq;
	private String email, comments, message, rating, boardType, title, content;
}
