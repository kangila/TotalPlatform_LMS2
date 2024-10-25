package com.example.demo.csc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CsQuestion;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

	private final QuestionRepository qr;
	private final QuestionUserRepository qur;
	
	//로그인한 유저의 모든 고객센터 문의글을 조회하는 메소드
//		public Page<CsQuestion> getList(int page, String id){
//			List<Sort.Order> sorts = new ArrayList<>();
//			sorts.add(Sort.Order.desc("questionDate"));
//
//			Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
//			
//			return this.qr.findByUser(getuser(id), pageable);
//		}	
	


	
	
}
