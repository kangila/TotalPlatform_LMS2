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
@Table(name = "sub_payment")
@Getter
@Setter
public class SubPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subPayId;
	
	private Integer price; //구독 가격
	private String type; //구독 종류 (1개월 / 3개월 / 6개월 / 12개월)
	private String paymentType; //결제 방식
	private LocalDateTime createDate; //구매일자
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
