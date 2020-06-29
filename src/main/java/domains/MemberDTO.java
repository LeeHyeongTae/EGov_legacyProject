package domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class MemberDTO {
	private int seq;
	private String name, email, password;
}
