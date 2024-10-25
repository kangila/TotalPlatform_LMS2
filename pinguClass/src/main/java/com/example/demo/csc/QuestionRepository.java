package com.example.demo.csc;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CsQuestion;
import com.example.demo.entity.User;

public interface QuestionRepository extends JpaRepository<CsQuestion, Integer> {
	Page<CsQuestion> findAll(Pageable pageable);
	Page<CsQuestion> findByUser(User user, Pageable pageable);
	
}
