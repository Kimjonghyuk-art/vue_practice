package com.vueProj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vueProj.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	Member findByEmailAndPassword(String email,String password);

}
