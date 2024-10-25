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
@Table(name = "lecture")
@Getter
@Setter
public class Lecture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lectureId;
	
	private String title; //제목
	private Integer lectureOrder; //강의 순서
	private String objective; //목표
	private Integer fileId; //동영상 파일
	private LocalDateTime lastUpdate; //수정날짜
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
}
