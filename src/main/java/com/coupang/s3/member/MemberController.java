package com.coupang.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping("test")
	public void test() {
		memberService.test();
		System.out.println("MemberController");
	}
	
	//로그인
	
	//회원가입
	
	//
	
}
