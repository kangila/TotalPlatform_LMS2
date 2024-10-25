package com.example.demo.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AdminController {
	
	private final AdminService adService;

	@GetMapping("/admin")
	public String adminLogin() {
		
		return "admin/adminLogin";
	}
	
	/* ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 회원 조회 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ */
	@GetMapping("/admin/userList")
	public String userList(Model model) {
		
		List<User> userList = this.adService.getUserList();
		
		model.addAttribute("userList", userList);
		 
		return "admin/adminUserList";
	}
	
	/* ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 강사 등록 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ */
	@GetMapping("/admin/setInst/{id}")
	public String createInstructor(Model model, @PathVariable("id") Integer userId) {
		
		this.adService.createInstructor(userId);
		
		return "admin/adminUserList";
	}

}











