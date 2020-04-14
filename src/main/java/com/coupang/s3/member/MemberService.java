package com.coupang.s3.member;

public class MemberService {

	private MemberDAO memberDAO;	//의존성 주입

	public MemberService() {
		
	}
	
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public void test() {
		memberDAO.test();
		System.out.println("MemberService");
	}
	
}
