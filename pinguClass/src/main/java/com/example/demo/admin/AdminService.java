package com.example.demo.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AdminService {
	
	private final AdminUserRepository adminUserRepository;
	private final AdminInstructorRepository adminInstructorRepository;

	/* ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 모든 회원 조회 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ */
	public List<User> getUserList() {
		
		List<User> userList = this.adminUserRepository.findAll();
		
		return userList;
	}
	
	/* ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 회원 1명 조회 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ */
	public User getUser(Integer userId) {
		
		Optional<User> user = this.adminUserRepository.findById(userId);
		
		return user.get();
	}
	
	/* ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 강사 등록 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ */
	public void createInstructor(Integer userId) {
		
		Instructor inst = new Instructor();
		
		this.adminInstructorRepository.save(inst);
	}
	
	/* ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 회원 정지 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ */
	public void bannedUser(Integer userId) {
		
		Instructor inst = new Instructor();
		
		this.adminInstructorRepository.save(inst);
	}

}













