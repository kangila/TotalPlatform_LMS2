package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cs_answer")
@Getter
@Setter
public class CsAnswer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer answerId;
	
	private String title;
	private String content;
	private LocalDateTime lastUpdate; //최근업데이트 날짜
	
	@OneToOne
	@JoinColumn(name="question_id")
	private CsQuestion csQuestion;
	
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;
}
