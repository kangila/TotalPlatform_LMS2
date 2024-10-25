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
@Table(name = "cs_question")
@Getter
@Setter
public class CsQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer questionId;
	
	private String title;
	private String content;
	private LocalDateTime lastUpdate; //최근업데이트 날짜
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne(mappedBy = "csQuestion")
	private CsAnswer csAnswer;
}






