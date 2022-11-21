package com.pwj.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.pwj.blog 패키지 이하를 스캔해서 모든파일을 메모리에 new하는 것이 아니라
//특정 어노테이션이 붙어있는 클래스파일들을 new해서 ioc 스프링컨테이너에서 관리해준다.
@RestController
public class BlogControllerTest {

	//http://localhost:8080/test/hello 하면 브라우저에서 바로 해당 내용이 찍힘.
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
