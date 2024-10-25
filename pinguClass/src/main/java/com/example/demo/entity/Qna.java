package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "qna")
@Getter
@Setter
public class Qna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer qnaId;
	
	private String title;
	private String content;
	private LocalDateTime lastUpdate; //최근업데이트 날짜
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
}
