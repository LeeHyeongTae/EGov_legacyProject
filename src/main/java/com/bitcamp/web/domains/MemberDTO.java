package com.bitcamp.web.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Component
@Lazy
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
//	private int seq;
	private String name, email, password;
}
