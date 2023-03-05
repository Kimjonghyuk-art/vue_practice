package com.vueProj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vueProj.entity.Member;
import com.vueProj.repository.MemberRepository;

@RestController
public class AccountController {
	
	@Autowired
	MemberRepository memberRepository;


	@PostMapping("/api/account/login")
	public int login(@RequestBody Map<String, String> params) {
		
		Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));
		
		if(member != null) {
			return member.getId();
		}
		
		return 0;
		
	}
	
}
