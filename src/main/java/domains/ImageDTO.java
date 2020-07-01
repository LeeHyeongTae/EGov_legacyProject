package domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Lazy 
@AllArgsConstructor 
@NoArgsConstructor
@Component
public class ImageDTO {
	private int imageSeq;
	private String image;
}
