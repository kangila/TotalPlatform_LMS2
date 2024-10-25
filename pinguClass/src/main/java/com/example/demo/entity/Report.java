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
@Table(name = "report")
@Getter
@Setter
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reportId;
	
	private String content;
	private LocalDateTime createDate; //신고날짜
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "userId")
	private User reporter; //신고한 유저
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "userId")
	private User reportee; //신고당한 유저
	
}
