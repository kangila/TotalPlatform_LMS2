package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "subscription")
@Getter
@Setter
public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subId;
	
	private String type; //구독 종류 (1개월 / 3개월 / 6개월 / 12개월)
	private LocalDateTime startDate; //구독 시작 날짜
	private LocalDateTime endDate; //구독 종료 날짜
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
}
